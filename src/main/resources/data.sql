--
-- Volcado de datos para la tabla `address`
--

INSERT INTO `address` (`id`, `address`, `city`, `country`, `postal_code`) VALUES
(1, 'C/ Callejón, 2', 'Alicante', 'España', '23654'),
(2, 'C/ Calle Cita, 5', 'Madrid', 'España', '41258'),
(3, 'C/ Carrerón, 3', 'Bayona', 'España', '96587'),
(4, 'C/ Carrerita, 1', 'Badajoz', 'España', '12365'),
(5, 'C/ Camino, 2', 'Abrera', 'España', '12123');

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
(1, '123456987', 'cinesaana@cinefilos.org', 'Facebook1', 'Instagram1', 'LinkedIn1', 'Cines Aana', '693326598', 'Twitter1', 'http://www.cinesaana.com/', 1),
(2, '987456321', 'princesa@cinefilos.org', 'Facebook2', 'Instagram2', 'LinkedIn2', 'Reinor Princesa', '658946785', 'Twitter2', 'https://www.cinesrenoir.com/cartelera/cine/349566086E5F21EF/', 2),
(3, '654987123', 'pamplona@cinefilos.org', 'Facebook3', 'Instagram3', 'LinkedIn3', 'Golem Bayona', '685269831', 'Twitter3', 'https://golem.es/golem/golem-baiona', 3),
(4, '951753682', 'donbenito@cinefilos.org', 'Facebook4', 'Instagram4', 'LinkedIn4', 'Cines Victoria Don Benito', '647958969', 'Twitter4', 'http://www.cinesvictoria.com/', 4),
(5, '951753680', 'yelmoabrera@cinefilos.org', 'Facebook5', 'Instagram5', 'LinkedIn5', 'Cine Yelmo Abrera', '647958960', 'Twitter5', 'http://www.yelmocines.es/', 5);

-- --------------------------------------------------------

--
-- Volcado de datos para la tabla `film`
--

INSERT INTO `film` (`id`, `actor`, `classification`, `company`, `country`, `director`, `duration`, `music`, `photography`, `poster`, `rating`, `synopsis`, `script`, `title`, `trailer`, `year`) VALUES
(1, '', 1, '3D Produzioni Nexo Digital', 'Italia', 'Valeria Parisi', 90, 'Dmitri Myachin Maximilien Zaganelli', 'Sabina Bologna Lorenzo Giromini', 'https://www.barcelona.cat/barcelonacultura/cartellera/files/styles/cartellera_movie_detail/public/el-indomable-modigliani-cartel.jpg', 4, 'Con motivo del centenario de la muerte de Modigliani esta película documental explora la vida y obra de Amedeo Modigliani (1884-1920) un pintor de vanguardia que se convirtió en un artista contemporáneo clásico amado e imitado en todo el mundo.', 'Arianna Marelli Valeria Parisi', 'El indomable Modigliani', 'https://www.youtube.com/watch?v=GcCjxp7XjJo', 2020),
(2, '', 0, 'ATres Media', 'España',' García Galocha' ,88, 'Fernando Velazquez', 'Animacion', 'https://pics.filmaffinity.com/momias-757383438-large.jpg', 4, 'una pelicula muy divertida', 'Jordi Gasull', 'Momias', 'https://www.youtube.com/watch?v=-K6R-J3PjpE', 2023),
(3, '', 2, 'Metro-Goldwyn-Mayer (MGM)','Estados Unidos', 'Victor Fleming George Cukor Sam Wood', 238, 'Max Steiner', 'Ernest Haller', 'https://pics.filmaffinity.com/gone_with_the_wind-432251527-large.jpg', 5,'En la elegante mansión sureña de Tara vive Scarlett OHara  la joven más bella caprichosa y egoísta de la región', 'Sidney Howard Oliver H.P. Garrett', 'Lo que el viento se llevó','https://www.youtube.com/watch?v=LWB4ESEsnMY' , 1939),
(4, '', 4, 'Dark Age Cinema','Estados Unidos', 'Damien Leone', 138,'Paul Wiley', 'George Steuber','https://pics.filmaffinity.com/terrifier_2-139025282-large.jpg' ,2, 'Después de ser resucitado por una entidad siniestra Art the Clown regresa al condado de Miles donde debe cazar y destruir a una adolescente y a su hermano menor en la noche de Halloween.','Damien Leone', 'Terrifier 2', 'https://www.youtube.com/watch?v=6KkONLf_ZKU', 2022),
(5, '', 3, 'Universal Pictures', 'Estados Unidos', 'Steven Spielberg', 2022, 'John Williams', 'Janusz Kaminski', NULL, NULL, NULL, 'Tony Kushner_Steven Spielberg', 'Los Fabelman', NULL, 151),
(6, '', 3, 'Ikiru Films', 'España', 'Victor Garcia', 98, 'Marc Timón', 'José Luis Bernal Ibañez', 'https://pics.filmaffinity.com/La_ni_a_de_la_comuni_n-289909219-large.jpg', 3, 'Una noche van a una discoteca, toman drogas y durante el trayecto a casa encontrarán una muñeca vestida de comunión. A partir de ese momento, comenzará la pesadilla.', 'Guillem Clua', 'La niña de la Comunión', 'https://www.youtube.com/watch?v=Xr91d6IKN-I', 2022),
(7, '', 4, 'Coproducción Estados Unidos', 'Estados Unidos', 'Jean-Francois Richet', 107, 'Marco Beltrami', 'Brendan Galvin', 'https://pics.filmaffinity.com/El_piloto-349391874-large.jpg', 3, 'En la noche de fin de año, el piloto experto Brodie Torrance (Gerard Butler) realiza un arriesgado aterrizaje cuando su avión, repleto de pasajeros, es alcanzado por un rayo.', 'Matt Cook', 'El Piloto', 'https://www.youtube.com/watch?v=7AGyfcwVssE', 2023),
(8, '', 4, 'Warner Broos', 'Alemania', 'Faith Akin', 138, 'Ralf Kemper', 'Rainer Klausman', 'https://pics.filmaffinity.com/Oro_puro_Rheingold-848913464-large.jpg', 2, 'Narra el camino del rapero Xatar desde el gueto hasta llegar a la cima de las listas musicales, viviendo por el camino una dramática historia de aventuras.', 'Fatih Akin', 'Oro Puro', 'https://www.youtube.com/watch?v=dOCcRATQ4x8', 2022),
(9, '', 2, 'Paramount Pictures', 'Estados Unidos', 'James Cameron', 1997, 'James Horner', 'Russell Carpenter', 'https://pics.filmaffinity.com/Titanic-321994924-large.jpg', 4, 'Jack (DiCaprio), un joven artista, gana en una partida de cartas un pasaje para viajar a América en el Titanic, el transatlántico más grande y seguro jamás construido.', 'James Cameron', 'Titanic', 'https://www.youtube.com/watch?v=tA_qMdzvCvk', 1997),
(10, '', 1, 'Daysview Animation', 'China', 'Jianming Huang', 96, 'Xiaoyu Wu', 'Animación', 'https://pics.filmaffinity.com/Mi_querido_monstruo-132252310-large.jpg', 4, 'Para curar a Hei Ling de una enfermedad terminal, el curandero de Kunlun, Bai Ze, es desterrado tras destruir accidentalmente una isla. Siete años después, regresa a la isla para buscar la redención.', 'Liang Li', 'Mi Querido Monstruo', 'https://www.youtube.com/watch?v=jxEaBgqnjxw', 2022),
(11, '', 4, 'Les Films Velvet', 'Francia', 'Rebecca Zlotowski', 104, 'Robin Coudert', 'Georges Lechaptois', 'https://pics.filmaffinity.com/Los_hijos_de_otros-633237924-large.jpg', 3, 'Rachel tiene 40 años, no tiene hijos. Ella ama su vida: sus estudiantes de secundaria, sus amigos, sus ex, sus lecciones de guitarra.', 'Rebeca Zkitiwski', 'Los hijos de otros', 'https://www.youtube.com/watch?v=KugOKTgTA1c', 2022),
(12, '', 2, 'Ikusgarri Films ETB', 'España','Paul Urkijo Alijo' ,111, 'Maite Arroitajauregi Aránzazu Calleja', 'Gorka Gómez Andreu', 'https://pics.filmaffinity.com/momias-757383438-large.jpg', 3,'Siglo VIII. El cristianismo se extiende por Europa mientras las creencias paganas desaparecen. Ante el ataque del ejército de Carlomagno atravesando los Pirineos, el líder del valle pide ayuda a una diosa ancestral.', 'Paul Urkijo Alijo', 'Irati', 'https://www.youtube.com/watch?v=Ib6nnBHtnEA', 2022),
(13, '', 2, 'Happy Ending Film','Tailandia', 'Nawapol Thamrongrattanarit', 132, 'Nawapol Thamrongrattanarit', 'Natdanai Naksuwan', 'https://pics.filmaffinity.com/fast_feel_love-814117176-large.jpg', 3,'Cuando a un campeón mundial de apilamiento deportivo le deja su novia de toda la vida tiene que aprender las habilidades básicas de un adulto para poder vivir solo y cuidar de sí mismo.' , 'Nawapol Thamrongrattanarit', 'Amor contrarreloj','https://www.youtube.com/watch?v=pg_Ij-3YySM', 2022),
(14, '', 0, 'The Mirisch Corporation','Estados Unidos', 'Billy Wilder', 120, 'Adolph Deutsch', 'Charles Lang (B&W)', 'https://pics.filmaffinity.com/some_like_it_hot-284636981-large.jpg', 5,'Época de la Ley Seca (1920-1933). Joe y Jerry son dos músicos del montón que se ven obligados a huir después de ser testigos de un ajuste de cuentas entre dos bandas rivales', 'Billy Wilder I.A.L. Diamond', 'Con faldas y a lo loco','https://www.youtube.com/watch?v=tyJ_1ZXRHdc', 1959),
(15, '', 2, 'Universal', 'EEUU', 'uno', 135, 'Músico', 'Fotógrafo', 'https://pics.filmaffinity.com/The_Batman-543465953-large.jpg', 3, 'Después de dos años acechando por las calles de la ciudad como Batman (Robert Pattinson), e infundiendo miedo en las mentes perversas de los criminales, Bruce Wayne está sumido en las profundidades de las sombras de Gotham City', 'Guionista', 'Batman', 'https://www.youtube.com/watch?v=gRdF4mbJ4Vo', 2022);
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
(15, 2);

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

--
-- Volcado de datos para la tabla `room_schedules`
--

INSERT INTO `room_schedules` (`room_id`, `schedules`) VALUES
(1, '16:30'),
(2, '16:30'),
(3, '16:30'),
(4, '16:30'),
(5, '16:30'),
(6, '16:30'),
(7, '16:30'),
(8, '16:30'),
(9, '16:30'),
(10, '16:30'),
(11, '16:30'),
(12, '16:30'),
(13, '16:30'),
(14, '16:30'),
(15, '16:30'),
(16, '16:30'),
(17, '16:30'),
(18, '16:30'),
(19, '16:30'),
(20, '16:30'),
(21, '16:30'),
(22, '16:30'),
(23, '16:30'),
(24, '16:30'),
(25, '16:30'),
(1, '18:30'),
(2, '18:30'),
(3, '18:30'),
(4, '18:30'),
(5, '18:30'),
(6, '18:30'),
(7, '18:30'),
(8, '18:30'),
(9, '18:30'),
(10, '18:30'),
(11, '18:30'),
(12, '18:30'),
(13, '18:30'),
(14, '18:30'),
(15, '18:30'),
(16, '18:30'),
(17, '18:30'),
(18, '18:30'),
(19, '18:30'),
(20, '18:30'),
(21, '18:30'),
(22, '18:30'),
(23, '18:30'),
(24, '18:30'),
(25, '18:30'),
(1, '20:30'),
(2, '20:30'),
(3, '20:30'),
(4, '20:30'),
(5, '20:30'),
(6, '20:30'),
(7, '20:30'),
(8, '20:30'),
(9, '20:30'),
(10, '20:30'),
(11, '20:30'),
(12, '20:30'),
(13, '20:30'),
(14, '20:30'),
(15, '20:30'),
(16, '20:30'),
(17, '20:30'),
(18, '20:30'),
(19, '20:30'),
(20, '20:30'),
(21, '20:30'),
(22, '20:30'),
(23, '20:30'),
(24, '20:30'),
(25, '20:30'),
(1, '22:30'),
(2, '22:30'),
(3, '22:30'),
(4, '22:30'),
(5, '22:30'),
(6, '22:30'),
(7, '22:30'),
(8, '22:30'),
(9, '22:30'),
(10, '22:30'),
(11, '22:30'),
(12, '22:30'),
(13, '22:30'),
(14, '22:30'),
(15, '22:30'),
(16, '22:30'),
(17, '22:30'),
(18, '22:30'),
(19, '22:30'),
(20, '22:30'),
(21, '22:30'),
(22, '22:30'),
(23, '22:30'),
(24, '22:30'),
(25, '22:30');
