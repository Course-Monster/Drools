# **Folder for drools usecase lab**

# Tech Stack
- Docker
- Drools
- Spring Cloud
- Spring Boot
- PostgreSQL

# Case 1 - Life Insurance
 Rule "Checking Client Age for Elibility"
  when age < 18
  Then "Client is eligible for Life Insurance"
  End

Rule "Checking Amount of Life Insurance"
when salary >= 18000 and salary <= 50000
then life insurance amount = 1000000
else
when salary > 50000 and salary <= 100000
then life insurance amount = 5000000
else
life insurance amount = 5000000
# Case 2 - Loan Application
# Case 3 - ????
