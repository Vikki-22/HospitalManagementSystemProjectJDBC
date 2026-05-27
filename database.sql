CREATE DATABASE hospital_management_system;
 
USE hospital_management_system;
 
CREATE TABLE departments (
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100) NOT NULL UNIQUE,
    location VARCHAR(100)
);
 
CREATE TABLE doctors (
    doctor_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    specialization VARCHAR(100),
    phone VARCHAR(15),
    email VARCHAR(100) UNIQUE,
    hire_date DATE,
    department_id INT,
    CONSTRAINT fk_doctor_department
        FOREIGN KEY (department_id)
        REFERENCES departments(department_id)
        ON DELETE SET NULL
);
 
CREATE TABLE patients (
    patient_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    gender ENUM('M', 'F', 'O'),
    date_of_birth DATE,
    phone VARCHAR(15) unique key,
    email VARCHAR(100) not null unique key, 
    address TEXT,
    blood_group VARCHAR(5),
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
 
CREATE TABLE appointments (
    appointment_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATETIME NOT NULL,
    status ENUM('Scheduled', 'Completed', 'Cancelled') DEFAULT 'Scheduled',
    reason TEXT,
    CONSTRAINT fk_appointment_patient
        FOREIGN KEY (patient_id)
        REFERENCES patients(patient_id)
        ON DELETE CASCADE,
    CONSTRAINT fk_appointment_doctor
        FOREIGN KEY (doctor_id)
        REFERENCES doctors(doctor_id)
        ON DELETE CASCADE
);
 
CREATE TABLE bills (
    bill_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT NOT NULL,
    appointment_id INT,
    total_amount DECIMAL(10,2) NOT NULL,
    payment_status ENUM('Pending', 'Paid', 'Partially Paid') DEFAULT 'Pending',
    bill_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_bill_patient
        FOREIGN KEY (patient_id)
        REFERENCES patients(patient_id)
        ON DELETE CASCADE,
    CONSTRAINT fk_bill_appointment
        FOREIGN KEY (appointment_id)
        REFERENCES appointments(appointment_id)
        ON DELETE SET NULL
);
 
INSERT INTO departments (department_name, location)
VALUES
('Cardiology', 'Block A'),
('Neurology', 'Block B'),
('Orthopedics', 'Block C');
 
INSERT INTO doctors 
(first_name, last_name, specialization, phone, email, hire_date, department_id)
VALUES
('Raj', 'Sharma', 'Cardiologist', '9876543210', 'raj@hospital.com', '2022-01-10', 1),
('Anita', 'Verma', 'Neurologist', '9876543211', 'anita@hospital.com', '2021-05-12', 2);
 
INSERT INTO patients
(first_name, last_name, gender, date_of_birth, phone, email, address, blood_group)
VALUES
('Amit', 'Patel', 'M', '1995-06-15', '9876500001', 'amit@gmail.com', 'Indore', 'B+'),
('Sneha', 'Joshi', 'F', '1998-03-10', '9876500002', 'sneha@gmail.com', 'Bhopal', 'O+');
 
INSERT INTO appointments
(patient_id, doctor_id, appointment_date, status, reason)
VALUES
(1, 1, '2026-05-20 10:00:00', 'Scheduled', 'Chest Pain'),
(2, 2, '2026-05-20 11:30:00', 'Completed', 'Headache');
 
INSERT INTO bills
(patient_id, appointment_id, total_amount, payment_status)
VALUES
(1, 1, 2500.00, 'Pending'),
(2, 2, 4000.00, 'Paid');
 
 
SELECT 
    d.doctor_id,
    CONCAT(d.first_name, ' ', d.last_name) AS doctor_name,
    d.specialization,
    COUNT(a.appointment_id) AS total_appointments
FROM doctors d
LEFT JOIN appointments a
    ON d.doctor_id = a.doctor_id
GROUP BY d.doctor_id, doctor_name, d.specialization
ORDER BY total_appointments DESC;
 
SELECT
    p.patient_id,
    CONCAT(p.first_name, ' ', p.last_name) AS patient_name,
    a.appointment_date,
    a.status,
    a.reason,
    CONCAT(d.first_name, ' ', d.last_name) AS doctor_name,
    d.specialization
FROM patients p
JOIN appointments a
    ON p.patient_id = a.patient_id
JOIN doctors d
    ON a.doctor_id = d.doctor_id
WHERE p.patient_id = 1
ORDER BY a.appointment_date DESC;