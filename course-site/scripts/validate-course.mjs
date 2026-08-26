import fs from 'node:fs';
import path from 'node:path';

const root = path.resolve(process.cwd(), 'docs');
const requiredFrontMatter = ['title:', 'description:', 'sidebar_position:'];
const requiredPages = ['start-here.md','learner-guide.md','course-map.md','environment-setup.md','capstone.md','assessment/diagnostic.md','assessment/final-assessment.md','quality/standards-alignment.md','quality/accessibility.md','quality/publishing-checklist.md'];
let failed = false;
for (const relative of requiredPages) {
  const target = path.join(root, relative);
  if (!fs.existsSync(target)) { console.error(`Missing required course page: ${relative}`); failed = true; }
}
const moduleFiles = fs.readdirSync(path.join(root, 'modules')).filter((f) => f.endsWith('.md'));
const labFiles = fs.readdirSync(path.join(root, 'labs')).filter((f) => f.endsWith('.md'));
if (moduleFiles.length !== 8) { console.error(`Expected 8 module pages; found ${moduleFiles.length}.`); failed = true; }
if (labFiles.length !== 8) { console.error(`Expected 8 lab pages; found ${labFiles.length}.`); failed = true; }
function walk(dir) {
  for (const entry of fs.readdirSync(dir, {withFileTypes: true})) {
    const full = path.join(dir, entry.name);
    if (entry.isDirectory()) walk(full);
    if (entry.isFile() && /\.mdx?$/.test(entry.name)) {
      const text = fs.readFileSync(full, 'utf8');
      if (!text.startsWith('---')) { console.error(`Missing front matter: ${path.relative(root, full)}`); failed = true; }
      for (const marker of requiredFrontMatter) if (!text.includes(marker)) { console.error(`Missing "${marker}" in ${path.relative(root, full)}`); failed = true; }
    }
  }
}
walk(root);
if (failed) process.exit(1);
console.log(`Course validation passed: ${moduleFiles.length} modules, ${labFiles.length} labs, required governance pages present.`);
