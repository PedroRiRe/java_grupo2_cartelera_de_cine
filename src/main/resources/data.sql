--
-- Volcado de datos para la tabla `address`
--

INSERT INTO `address` (`id`, `address`, `city`, `country`, `postal_code`) VALUES
(1, 'C/ Callejón, 2', 'Alicante', 'España', '23654'),
(2, 'C/ Calle Cita, 5', 'Madrid', 'España', '41258'),
(3, 'C/ Carrerón, 3', 'Burgos', 'España', '96587'),
(4, 'C/ Carrerita, 1', 'Pamplona', 'España', '12365'),
(5, 'C/ Camino, 2', 'Orense', 'España', '12123');

-- --------------------------------------------------------

--
-- Volcado de datos para la tabla `app_users`
-- Contraseña: 632541
--

INSERT INTO `users` (`id`, `email`, `name`, `password`, `surname`, `username`) VALUES
(1, 'doloresem@il', 'Dolores', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Fuertes', 'dfuertes'),
(2, 'manuelem@il', 'Manuel', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Perez', 'mperez'),
(3, 'rosaem@il', 'Rosa', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Fuentes', 'rfuentes'),
(4, 'luisem@il', 'Luis', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Reta', 'lreta'),
(5, 'mariaem@il', 'María', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Fernandez', 'mfernandez'),
(6, 'robertoem@il', 'Roberto', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Martinez', 'rmartinez'),
(7, 'anaem@il', 'Ana', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Melendez', 'amelendez'),
(8, 'albertoem@il', 'Alberto', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Lopez', 'alopez'),
(9, 'mercedesem@il', 'Mercedes', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Mila', 'mmila'),
(10, 'ramonem@il', 'Ramón', '$2a$10$dsQX4tLUoI9qFpRXhdRYcOpM1ORFAU60Jtr/WSn.g0mY6ADvZsa5q', 'Perez', 'rperez');

-- --------------------------------------------------------

--
-- Volcado de datos para la tabla `cinema`
--

INSERT INTO `cinema` (`id`, `cif`, `email`, `facebook`, `instagram`, `linked_in`, `name`, `phone`, `twitter`, `url`, `address_id`) VALUES
(1, '123456987', 'alicante@cinefilos.org', 'Facebook1', 'Instagram1', 'LinkedIn1', 'CineAlicante', '693326598', 'Twitter1', 'http://cinealicante.com', 1),
(2, '987456321', 'marid@cinefilos.org', 'Facebook2', 'Instagram2', 'LinkedIn2', 'CineMadrid', '658946785', 'Twitter2', 'http://cinemadrid.com', 2),
(3, '654987123', 'burgos@cinefilos.org', 'Facebook3', 'Instagram3', 'LinkedIn3', 'Burgos', '685269831', 'Twitter3', 'http://cineburgos.com', 3),
(4, '951753682', 'pamplona@cinefilos.org', 'Facebook4', 'Instagram4', 'LinkedIn4', 'Pamplona', '647958969', 'Twitter4', 'http://cinepamplona.com', 4),
(5, '951753680', 'pamplona2@cinefilos.org', 'Facebook5', 'Instagram5', 'LinkedIn5', 'Pamplona2', '647958960', 'Twitter5', 'http://cinepamplona2.com', 5);

-- --------------------------------------------------------

--
-- Volcado de datos para la tabla `film`
--

INSERT INTO `film` (`id`, `classification`, `company`, `country`, `director`, `duration`, `music`, `photography`, `poster`, `rating`, `review`, `script`, `title`, `trailer`, `year`) VALUES
(1, 1, 'Universal', 'EEUU', 'uno', 120, 'Músico', 'Fotógrafo', NULL, NULL, NULL, 'Guionista', 'Spiderman', NULL, 2020),
(2, 2, 'Universal', 'EEUU', 'uno', 135, 'Músico', 'Fotógrafo', NULL, NULL, NULL, 'Guionista', 'Batman', NULL, 2020),
(3, 2, 'Universal', 'EEUU', 'uno', 115, 'Músico', 'Fotógrafo', NULL, NULL, NULL, 'Guionista', 'Superman', NULL, 2020),
(4, 0, 'Universal', 'EEUU', 'uno', 122, 'Músico', 'Fotógrafo', NULL, NULL, NULL, 'Guionista', 'X-Men', NULL, 2020),
(5, 3, 'Universal Pictures', 'Estados Unidos', 'Steven Spielberg', 2022, 'John Williams', 'Janusz Kaminski', NULL, NULL, NULL, 'Tony Kushner_Steven Spielberg', 'Los Fabelman', NULL, 151),
(6, 3, 'Ikiru Films', 'España', 'Victor Garcia', 2022, 'Marc Timón', 'José Luis Bernal Ibañez', NULL, NULL, NULL, 'Guillem Clua', 'La niña de la Comunión', NULL, 98),
(7, 4, 'Coproducción Estados Unidos', 'Estados Unidos', 'Jean-Francois Richet', 2023, 'Marco Beltrami', 'Brendan Galvin', NULL, NULL, NULL, 'Matt Cook', 'El Piloto', NULL, 107),
(8, 4, 'Warner Broos', 'Alemania', 'Faith Akin', 2022, 'Ralf Kemper', 'Rainer Klausman', NULL, NULL, NULL, 'Fatih Akin', 'Oro Puro', NULL, 138),
(9, 2, 'Paramount Pictures', 'Estados Unidos', 'James Cameron', 1997, 'James Horner', 'Russell Carpenter', NULL, NULL, NULL, 'James Cameron', 'Titanic', NULL, 195),
(10, 1, 'Daysview Animation', 'China', 'Jianming Huang', 2022, 'Xiaoyu Wu', 'Animación', NULL, NULL, NULL, 'Liang Li', 'Mi Querido Monstruo', NULL, 99),
(11, 3, 'Toei', 'Japón', 'Saim Kohei Yoshino', 2022, 'Mizuki Tsujimura', 'Motonobu kiyoku', NULL, NULL, NULL, 'Yosuke Masaike', 'Anime Supremacy!', NULL, 128),
(12, 2, 'Walt Disney Pictures', 'Reino Unido', 'Martin McDonagh', 2022, 'Carter Burwell', 'Ben Davis', NULL, NULL, NULL, 'Martin McDonagh', 'Almas en pena de Inisherin', NULL, 114),
(13, 3, 'Universal Pictures', 'Estados Unidos', 'M. Night Shyamalan', 2023, 'Herdís Stefánsdóttir', 'Jarin Blaschke', NULL, NULL, NULL, 'M. Night Shyamalan', 'Llaman a la puerta', NULL, 100),
(14, 1, 'Les Editions Albert René', 'Francia', 'Guillaume Canet', 2023, 'Matthie Chedid', 'Andre Chemetoff', NULL, NULL, NULL, 'Guillaume Canet', 'Astérix y Obélix y el reino medio', NULL, 111),
(15, 2, 'AGBO', 'Estados Unidos', 'Dan Kwan', 2022, 'Son Lux', 'Larkin Seiple', NULL, NULL, NULL, 'Dan Kwan', 'Todo a la vez en todas partes', NULL, 139),
(16, 4, 'Les Films Velvet', 'Francia', 'Rebecca Zlotowski', 2022, 'Robin Coudert', 'Georges Lechaptois', NULL, NULL, NULL, 'Rebeca Zkitiwski', 'Los hijos de otros', NULL, 104);

-- --------------------------------------------------------

--
-- Volcado de datos para la tabla `film_genders`
--

INSERT INTO `film_genders` (`film_id`, `genders`) VALUES
(1, 2),
(2, 2),
(3, 2),
(4, 2),
(5, 1),
(6, 6),
(7, 2),
(8, 2),
(9, 8),
(10, 9),
(11, 1),
(12, 1),
(13, 6),
(14, 0),
(15, 2),
(16, 1);

-- --------------------------------------------------------

--
-- Volcado de datos para la tabla `room`
--

INSERT INTO `room` (`id`, `active`, `capacity`, `premiere`, `room_number`, `cinema_id`, `film_id`) VALUES
(null, b'1', 130, '2023-02-18', 1, 1, 1),
(null, b'1', 130, '2023-02-18', 2, 1, 2),
(null, b'1', 130, '2023-02-18', 3, 1, 3),
(null, b'1', 130, '2023-02-18', 4, 1, 4),
(null, b'1', 130, '2023-02-18', 5, 1, 5),

(null, b'1', 130, '2023-02-18', 1, 2, 1),
(null, b'1', 130, '2023-02-18', 2, 2, 2),
(null, b'1', 130, '2023-02-18', 3, 2, 3),
(null, b'1', 130, '2023-02-18', 4, 2, 4),
(null, b'1', 130, '2023-02-18', 5, 2, 5),

(null, b'1', 130, '2023-02-18', 1, 3, 1),
(null, b'1', 130, '2023-02-18', 2, 3, 2),
(null, b'1', 130, '2023-02-18', 3, 3, 3),
(null, b'1', 130, '2023-02-18', 4, 3, 4),
(null, b'1', 130, '2023-02-18', 5, 3, 5),

(null, b'1', 130, '2023-02-18', 1, 4, 1),
(null, b'1', 130, '2023-02-18', 2, 4, 2),
(null, b'1', 130, '2023-02-18', 3, 4, 3),
(null, b'1', 130, '2023-02-18', 4, 4, 4),
(null, b'1', 130, '2023-02-18', 5, 4, 5),

(null, b'1', 130, '2023-02-18', 1, 5, 1),
(null, b'1', 130, '2023-02-18', 2, 5, 2),
(null, b'1', 130, '2023-02-18', 3, 5, 3),
(null, b'1', 130, '2023-02-18', 4, 5, 4),
(null, b'1', 130, '2023-02-18', 5, 5, 5);
