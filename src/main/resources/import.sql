INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');
INSERT INTO roles (name) VALUES ('ROLE_POLI');
INSERT INTO users(username, password) VALUES ('user1','$2a$12$1k34YdrmxBkVborQvZLh2OUvX1S80GVVQjZJ5H55y1eez7XV.nV06');
INSERT INTO users(username, password) VALUES ('admin','$2a$12$1k34YdrmxBkVborQvZLh2OUvX1S80GVVQjZJ5H55y1eez7XV.nV06');
INSERT INTO users(username, password) VALUES ('poli1','$2a$12$1k34YdrmxBkVborQvZLh2OUvX1S80GVVQjZJ5H55y1eez7XV.nV06');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1); -- user1 with ROLE_USER
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2); -- admin with ROLE_ADMIN
INSERT INTO user_roles (user_id, role_id) VALUES (3, 3);
INSERT INTO tipo_incidente (dsae_nombre) VALUES ('Colisión');
INSERT INTO tipo_incidente (dsae_nombre) VALUES ('Atropello');

INSERT INTO incidente (dsae_id, dsae_descripcion, dsae_fecha, dsae_lugar, tipo_incidente_id)
VALUES (1, 'Choque entre autos', '2025-07-01', 'Av. Arequipa', 1);

INSERT INTO incidente (dsae_id, dsae_descripcion, dsae_fecha, dsae_lugar, tipo_incidente_id)
VALUES (2, 'Atropello de peatón', '2025-07-03', 'Av. Brasil', 2);

INSERT INTO incidente (dsae_id, dsae_descripcion, dsae_fecha, dsae_lugar, tipo_incidente_id)
VALUES (3, 'Camioneta volcó', '2025-07-05', 'Panamericana Sur', 3);

INSERT INTO incidente (dsae_id, dsae_descripcion, dsae_fecha, dsae_lugar, tipo_incidente_id)
VALUES (4, 'Atropello múltiple', '2025-07-07', 'Av. La Marina', 2);
