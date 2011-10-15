insert into usuario(codUsuario,nomUsuario, apepatUsuario, apematUsuario, numDocumento, email, password)
values('JROA','Jonathan','Roa','Cansaya','42364208','jroa_3000@hotmail.com','123456');

insert into agencia(nombre,	direccion)
values ('LIMA','Direccion 1');
insert into agencia(nombre,	direccion)
values ('AREQUIPA','Direccion 2');
insert into agencia(nombre,	direccion)
values ('AYACUCHO','Direccion 3');
insert into agencia(nombre,	direccion)
values ('CUZCO','Direccion 4');
insert into agencia(nombre,	direccion)
values ('ILO','Direccion 5');
insert into agencia(nombre,	direccion)
values ('PUNO','Direccion 6');
insert into agencia(nombre,	direccion)
values ('PIURA','Direccion 6');


insert into bus(placa, numAsiento, estado)
values('XYZ-123',40, 0);
insert into bus(placa, numAsiento, estado)
values('ABC-123',40, 0);
insert into bus(placa, numAsiento, estado)
values('BBB-123',40, 0);
insert into bus(placa, numAsiento, estado)
values('CCC-123',40, 0);
insert into bus(placa, numAsiento, estado)
values('DDD-123',40, 0);


insert into viaje
(idAgenciaOrigen,idAgenciaDestino, idBus, fecha, hora, costo)
values
(0,1,0,'2011-11-11','2011-11-11 12:00:00',50.00);
insert into viaje
(idAgenciaOrigen,idAgenciaDestino, idBus, fecha, hora, costo)
values
(0,1,1,'2011-11-11','2011-11-11 13:00:00',60.00);
insert into viaje
(idAgenciaOrigen,idAgenciaDestino, idBus, fecha, hora, costo)
values
(0,1,2,'2011-11-11','2011-11-11 14:00:00',70.00);

insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 1,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, 'JROA', 2,1);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 3,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 4,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 5,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 6,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 7,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 8,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 9,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 10,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 11,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 12,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 13,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 14,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 15,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 16,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 17,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 18,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 19,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 20,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 21,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 22,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 23,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 24,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 25,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 26,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 27,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 28,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 29,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 30,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 31,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 32,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 33,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 34,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 35,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 36,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 37,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 38,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 39,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (0, null, 40,0);

insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 1,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 2,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 3,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 4,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 5,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 6,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 7,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 8,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 9,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 10,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 11,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 12,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 13,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 14,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 15,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 16,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 17,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 18,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 19,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 20,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 21,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 22,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 23,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 24,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 25,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 26,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 27,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 28,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 29,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 30,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 31,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 32,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 33,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 34,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 35,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 36,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 37,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 38,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 39,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (1, null, 40,0);


insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 1,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 2,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 3,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 4,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 5,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 6,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 7,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 8,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 9,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 10,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 11,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 12,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 13,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 14,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 15,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 16,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 17,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 18,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 19,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 20,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 21,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 22,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 23,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 24,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 25,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 26,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 27,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 28,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 29,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 30,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 31,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 32,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 33,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 34,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 35,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 36,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 37,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 38,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 39,0);
insert into asiento(idViaje, codUsuario,  numAsiento, estado) values (2, null, 40,0);


insert into Boleto(idBoleto,fecha,monto,idAsiento)
values(1,'2011-11-11',50.00,1);
