CREATE TABLE IF NOT EXISTS Furniture (id INTEGER PRIMARY KEY, name VARCHAR(100),  price INTEGER);
CREATE TABLE IF NOT EXISTS Furniture_Attributes (id INTEGER PRIMARY KEY, attributes_key VARCHAR(100), Furniture_id INTEGER , attributes VARCHAR(100));

insert into Furniture (id, name, price) values (1, 'table', 499);
insert into Furniture (id, name, price) values (2, 'working desk', 1299);
insert into Furniture (id, name, price) values (3, 'bed', 599);
insert into Furniture (id, name, price) values (4, 'sofa', 1599);

insert into Furniture_Attributes (id, attributes_key, Furniture_id, attributes) values (1,'color', 4, 'white');
insert into Furniture_Attributes (id, attributes_key, Furniture_id, attributes) values (2,'material', 4, 'leather');
insert into Furniture_Attributes (id, attributes_key, Furniture_id, attributes) values (3,'mattress', 3, 'hard');
insert into Furniture_Attributes (id, attributes_key, Furniture_id, attributes) values (4,'size', 3, '220X200');
insert into Furniture_Attributes (id, attributes_key, Furniture_id, attributes) values (5,'size', 1, '100X200');
insert into Furniture_Attributes (id, attributes_key, Furniture_id, attributes) values (6,'size', 2, '100X180');
insert into Furniture_Attributes (id, attributes_key, Furniture_id, attributes) values (6,'size', 4, '100X200');
