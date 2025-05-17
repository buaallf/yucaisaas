# YucaiSaaS Platform Business Modules

This repository contains part of the business module code for a SaaS platform, including **Membership Management** and **Promotion Campaign** functionalities.

## 1. Project Overview

This platform aims to provide flexible and efficient business support services for small and medium-sized enterprises. The repository includes the following two independent modules:

- `yucaisaas-member`: Membership management module, supporting member registration, login, profile maintenance, and membership level management.
- `yucaisaas-promotion`: Promotion campaign module, supporting marketing campaign configuration, discount rules management, campaign launch, and analytics.

## 2. Development Approach

### 2.1 Technologies Used

Developed using [IntelliJ IDEA](https://www.jetbrains.com/idea/), the project leverages the following mainstream technologies:

- Backend: Spring Boot, Spring Cloud, MyBatis, MySQL, Redis
- Frontend: JavaScript, jQuery, HTML5, CSS3
- Deployment & Ops: Docker, Nginx

### 2.2 Project Structure

- `yucaisaas-member`: Membership management module
- `yucaisaas-promotion`: Promotion campaign module

Each module is an independent Spring Boot project and can be deployed separately or as part of an integrated system.

### 2.3 Running the Project (Example: Payslip Module)

> ⚠️ Note: The following example describes an internal demo service (Payslip), which can serve as a reference for testing flow.

A. Ensure **Microsoft .NET 5.0 SDK** is installed on your machine.  
B. On first run, the `Payslip.API` project will automatically create the database and seed it with demo data using **EF Core Code First**.  
C. Database connection settings can be found in:
```
Payslip.API/appsettings.json
```
Please adjust the connection string according to your local setup.  
D. Run both `Payslip.API` and `GenerateMonthlyPayslip` projects simultaneously.  
E. Test `Payslip.API` endpoints using Postman or Swagger.

## 3. Solution Design

This system adheres to the classic **SOLID software design principles** to enhance maintainability and scalability.

### 3.1 About Payslip.API (Example)

- `Payslip.API` provides API endpoints for generating monthly payslips
- It returns a payslip based on taxable income and a specified tax rate type (currently supports `TaxRateType: ResidentTaxRate=1`).

#### 3.1.1 Database Design

To accommodate multiple tax rate types, an enum has been defined in:
```
Payslip.API/Enums/TaxRateType.cs
```

This structure allows future extension based on different regional or national tax systems.

---

For feature requests or module extensions, feel free to submit issues or pull requests. Contributions are welcome!