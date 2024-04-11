/* Creado por: Abraham Salas Dimas
   Fecha: 11/abril/2024
   
   El siguinte código SQL crea las tablas necesarias para la base de datos del sistema medico.
   Actualmente carece de la tabla de consulta, sera implementada mas adelante.
*/

CREATE TABLE hospital.Usuario (
curp VARCHAR(18) not null,
nombre VARCHAR(25) not null,
apellido VARCHAR(20) not null,
sexo CHAR(1) not null,
edad int not null,
estado_civil VARCHAR(15) not null,
domicilio VARCHAR(40) not null,
telefono VARCHAR(10) not null,
username VARCHAR(15) not null,
contrasena VARCHAR(100) not null,
constraint primaryKey primary key (curp),
constraint sexoValido check (sexo = 'M' or sexo = 'F' or sexo = 'O'),
constraint edadValida check (edad >= 0 and edad <=100),
constraint usernameValido unique(username),
constraint numeroTelefonoValido unique(telefono)
);

CREATE TABLE hospital.Administrador (
id_administrador numeric NOT NULL,
curp VARCHAR(18) NOT NULL,
constraint primaryKeyAdmin PRIMARY KEY(id_administrador),
constraint foreingKeyAdmin FOREIGN KEY(curp) REFERENCES hospital.Usuario(curp)
);

CREATE TABLE hospital.Medico(
id_medico NUMERIC NOT NULL,
curp VARCHAR(18) NOT NULL,
cedula_profesional VARCHAR(8) NOT NULL,
constraint primaryKeyMedico PRIMARY KEY (id_medico),
constraint foreignKeyMedico FOREIGN KEY (curp) REFERENCES hospital.Usuario(curp),
constraint cedulaValida UNIQUE (cedula_profesional)
);

CREATE TABLE hospital.Secretaria(
id_secretaria NUMERIC NOT NULL,
curp VARCHAR(18) NOT NULL,
constraint primaryKeySecretaria PRIMARY KEY (id_secretaria),
constraint foreignKeySecretaria FOREIGN KEY (curp) REFERENCES hospital.Usuario(curp)
);

CREATE TABLE hospital.Sintoma(
id_sintoma NUMERIC NOT NULL,
nombre VARCHAR(15) NOT NULL,
CONSTRAINT primaryKeySintoma PRIMARY KEY (id_sintoma),
CONSTRAINT sintomaValido UNIQUE (nombre)
);

CREATE TABLE hospital.Signo(
id_signo NUMERIC NOT NULL,
nombre VARCHAR(15) NOT NULL,
CONSTRAINT primaryKeySigno PRIMARY KEY (id_signo),
CONSTRAINT signoValido UNIQUE (nombre)
);

CREATE TABLE hospital.Enfermedad(
id_enfermedad NUMERIC NOT NULL,
nombre VARCHAR(15) NOT NULL,
CONSTRAINT primaryKeyEnfermedad PRIMARY KEY (id_enfermedad),
CONSTRAINT enfermedadValida UNIQUE (nombre)
);

CREATE TABLE hospital.signo_por_enfermedad(
enfermedad NUMERIC NOT NULL,
signo NUMERIC NOT NULL,
CONSTRAINT foreignKeyEnfermedad FOREIGN KEY (enfermedad) REFERENCES hospital.Enfermedad(id_enfermedad),
CONSTRAINT foreignKeySigno FOREIGN KEY (signo) REFERENCES hospital.Signo(id_signo),
CONSTRAINT primaryKeySignoEnfermedad PRIMARY KEY (enfermedad, signo)
);

CREATE TABLE hospital.Sintoma_por_enfermedad(
enfermedad NUMERIC NOT NULL,
sintoma NUMERIC NOT NULL,
CONSTRAINT enfermedadForeignKey FOREIGN KEY (enfermedad) REFERENCES hospital.Enfermedad(id_enfermedad),
CONSTRAINT sintomaForeignKey FOREIGN KEY (sintoma) REFERENCES hospital.Sintoma(id_sintoma),
CONSTRAINT primaryKeySintomaEnfermedad PRIMARY KEY (enfermedad, sintoma)
);

CREATE TABLE hospital.Paciente(
curp VARCHAR(18) NOT NULL,
nombre VARCHAR(25) NOT NULL,
apellido VARCHAR(20) NOT NULL,
sexo CHAR(1) NOT NULL,
edad int NOT NULL,
estado_civil VARCHAR(15) NOT NULL,
domicilio VARCHAR(40) NOT NULL,
CONSTRAINT primaryKeyPaciente PRIMARY KEY (curp),
CONSTRAINT sexoValidoPaciente CHECK (sexo = 'M' or sexo = 'F' or sexo = 'O'),
CONSTRAINT edadValidaPaciente CHECK (edad >= 0 and edad <= 100)
);

CREATE TABLE hospital.Cita(
id_cita NUMERIC NOT NULL,
paciente VARCHAR(18) NOT NULL,
medico NUMERIC NOT NULL,
fecha VARCHAR(50) NOT NULL,
estatus CHAR(1) NOT NULL,
usuario VARCHAR(18) NOT NULL,
CONSTRAINT primaryKeyCita PRIMARY KEY (id_cita),
CONSTRAINT foreignKeyPaciente FOREIGN KEY (paciente) REFERENCES hospital.Paciente(curp),
CONSTRAINT foreignKeyMedicoCita FOREIGN KEY (medico) REFERENCES hospital.Medico(id_medico),
CONSTRAINT foreignKeyUsuario FOREIGN KEY (usuario) REFERENCES hospital.Usuario(curp)
);

commit;