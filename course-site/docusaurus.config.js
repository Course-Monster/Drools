const config = {
  title: 'Drools Decision Automation',
  tagline: 'Self-paced, lab-driven training for Drools 10.2',
  favicon: 'img/favicon.svg',
  url: 'https://drools.skunkworksacademy.com',
  baseUrl: '/',
  organizationName: 'skunkworks-academy',
  projectName: 'drools',
  onBrokenLinks: 'throw',
  onBrokenMarkdownLinks: 'throw',
  trailingSlash: false,
  presets: [
    [
      'classic',
      {
        docs: {
          sidebarPath: require.resolve('./sidebars.js'),
          routeBasePath: '/',
          showLastUpdateAuthor: true,
          showLastUpdateTime: true,
          editUrl: 'https://github.com/skunkworks-academy/drools/edit/main/course-site/'
        },
        blog: false,
        theme: {
          customCss: require.resolve('./src/css/custom.css')
        }
      }
    ]
  ],
  themeConfig: {
    metadata: [
      {name: 'course-provider', content: 'Skunkworks Academy'},
      {name: 'course-version', content: '1.0.0'},
      {name: 'drools-version', content: '10.2.0'},
      {name: 'delivery-mode', content: 'self-paced'}
    ],
    navbar: {
      title: 'Drools Self-Paced',
      items: [
        {to: '/start-here', label: 'Start Here', position: 'left'},
        {to: '/course-map', label: 'Course Map', position: 'left'},
        {to: '/capstone', label: 'Capstone', position: 'left'},
        {to: '/resources/glossary', label: 'Resources', position: 'left'},
        {href: 'https://github.com/skunkworks-academy/drools', label: 'GitHub', position: 'right'}
      ]
    },
    footer: {
      style: 'dark',
      links: [
        {
          title: 'Course',
          items: [
            {label: 'Start Here', to: '/start-here'},
            {label: 'Course Map', to: '/course-map'},
            {label: 'Final Assessment', to: '/assessment/final-assessment'}
          ]
        },
        {
          title: 'References',
          items: [
            {label: 'Apache KIE / Drools', href: 'https://kie.apache.org/'},
            {label: 'Docusaurus', href: 'https://docusaurus.io/'},
            {label: 'WCAG 2.2', href: 'https://www.w3.org/TR/WCAG22/'}
          ]
        }
      ],
      copyright: `Copyright © ${new Date().getFullYear()} Skunkworks Academy. Course source is version controlled.`
    },
    prism: {
      additionalLanguages: ['java', 'xml', 'bash', 'yaml']
    },
    colorMode: {
      defaultMode: 'light',
      disableSwitch: false,
      respectPrefersColorScheme: true
    }
  }
};

module.exports = config;
