# BankSecure IS Audit (local demo)

Java 21 / Spring Boot 3.4.5 / PostgreSQL / React / Vite.

**Security warning:** This starter deliberately allows unauthenticated API access and disables CSRF. Run it **only on your own laptop**, with fictional data. Do not deploy it publicly or use real bank data.

## Setup (Windows PowerShell)

1. Install Java 21, Maven, Node.js, PostgreSQL and VS Code.
2. In pgAdmin, create `banksecure_audit` database (see `database/create_database.sql`).
3. In PowerShell:
   ```powershell
   $env:DB_USERNAME="postgres"
   $env:DB_PASSWORD="YOUR_LOCAL_POSTGRES_PASSWORD"
   cd backend
   mvn spring-boot:run
   ```
4. Open http://localhost:8080/api/health (should show `{"status":"ok"}`).
5. In another terminal:
   ```powershell
   cd frontend
   npm install
   npm run dev
   ```
6. Open http://localhost:5173 and add demo assets/findings.

### Sample finding
Title: Unpatched demo application; Description: Simulated missing security updates; Likelihood: 4; Impact: 5; Expected score: 20 (Critical).

### Next steps for production-style learning
Add Spring Security authentication and roles, CSRF protection as appropriate, immutable audit trails, validation DTOs, error handling, migrations (Flyway), tests, authorization on every operation, evidence management, and backup/recovery processes.
