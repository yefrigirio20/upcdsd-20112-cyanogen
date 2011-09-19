create database transporte;
use transporte;


create table usuario
(
	codUsuario VARCHAR(30),
    nomUsuario VARCHAR(30),
	apepatUsuario VARCHAR(30),
	apematUsuario varchar(30),
	tipoDocumento int,
	numDocumento varchar(10),
	sexo int,
	email varchar(30),
	password varchar(30),
    constraint usuario_pk primary key(codUsuario)
);

create table agencia
(
	idAgencia int,
	nombre varchar(50),
	direccion varchar(50),
    constraint agencia_pk primary key(idAgencia)
);

create table asiento(
	idAsiento int,
	idViaje int,
	numAsiento int,
	estado int,
    constraint asiento_pk primary key(idAsiento)
);

create table boleto(
	idBoleto int,
	codUsuario varchar(30),
	fecha datetime,
	monto DECIMAL(12,2),
	idAsiento int,
    constraint boleto_pk primary key(idBoleto)
);

create table bus(
	idBus int,
	placa varchar(20),
	numAsiento int,
	estado int,
    constraint bus_pk primary key(idBus)
);


create table recorrido(
	idRecorrido int,
	idTracking int,
	fechallegada datetime,
	fechaSalida datetime,
	idAgencia int,
	estado int,
    constraint recorrido_pk primary key(idRecorrido)
);

create table tracking(
	idTracking int,
	idAgenciaOrigen int,
	idAgenciaDestino int,
	tipo int,
	direccion varchar(30),
	dniDestinatario varchar(10),
	nomDestinatario varchar(50),
	codUsuario varchar(30),
    constraint tracking_pk primary key(idTracking)
);


create table viaje(
	idViaje INT,
	idAgenciaOrigen int,
	idAgenciaDestino int,
	idBus int,
	fecha datetime,
	hora datetime,
	costoVip decimal,
	costoNegocio decimal,
	costoEconomico decimal,
    constraint viaje_pk primary key(idViaje)
);


--Select * from usuario where codUsuario = 'JROA'
