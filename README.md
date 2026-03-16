Musify
Un sistema de administración de música permite organizar nuestra colección musical en base
a cierta información relevante que contienen los archivos o pistas de audio. Cada pista de la
colección posee los siguientes atributos: ID, Título, Duración (en segundos), Artista o
Intérprete, Título del Álbum, Año, y Género (rock, pop, melódico, etc.). Las pistas de música
se pueden agregar y eliminar de la colección en todo momento, así como también cambiar
cualquiera de los atributos mencionados.
El sistema permite la creación y administración de listas de reproducción o playlists. Una
lista de reproducción tiene un nombre que la describe, y consiste en un subconjunto de la colección. Esto incluye el caso de que una playlist incluya como alguno de sus elementos otra
playlist.
Además de la funcionalidad mencionada el Sistema debe proveer los siguientes servicios:
1. Duración total: El sistema debe ser capaz de calcular la duración total de una playlist
creada por el usuario, en base a la suma de las duraciones de los elementos de la
misma.
2. Buscar todas las pistas que:
• Duren más de 25 Segundos
• El Año sea 1985
• Que el Artista sea Metallica y el año 1999
• Combinaciones lógicas de los anteriores.
En el caso de una playlist se retornan todas las pistas que cumplan con la condición
solicitada (sin importar el nivel de profundidad).
El sistema permite además la creación de pistas o playlists especiales:
• PlayList Promocionadas: es una playlist que quiere imponer una pista la cual está
promocionada, y por lo tanto siempre se incluye en cualquier búsqueda.
• Pista para todos: es una pista que siempre se incluye a sí misma en cualquier
búsqueda que se solicite.
• PlayList 3600: es una playlist la cual no permite incorporar más elementos si la
duración de la misma supera los 3600 segundos.