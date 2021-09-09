INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Kimchi', 'Kim', 'Svensson', 'kimchi86@gmail.com', 'bananskal123', 'Hello My name is Kim and I am new to Activly, let me know if you want to run togheter sometime! :)')
INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Raspi65', 'Robin', 'Runåker', 'Raspi65@gmail.com', 'hejvejs', 'I love to run and hike in the mountains. I have a dog named Ludde which is an Australian shepherd that loves running even more than me.')
INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Samlan', 'Sam', 'Kovalzyc', 'samZyc@hotmail.com', 'vodka', 'Just trying out this Activly-app and I must say, I am quite impressed. Since I started I have been out three times more than avarage. Choose Activly!')
INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Miki', 'Mikaela', 'Nyström', 'masny@hotmail.com', 'katt', 'Cats, long walks in the forests and home made pizza. What else?')
INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Hani', 'Johan', 'Lilja', 'jimail@hotmail.com', 'fisk', 'I am humbled that you navigated to my profile, together with my awesome team we made this really professional looking socail webbaplication, I hope you like it as much as I am!')
INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Liber', 'Lisa', 'Bergqvist', 'Liber@hotmail.com', 'hund', 'will update later!')
INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Måsten', 'Måns', 'Stenskvätt', 'StenMåns@hotmail.com', 'kanin','I love birding and get a lot of steps in during the summer, why not combine iit with this stunning web-app and get rewarded for doing something I love?')
INSERT INTO USER (Alias, FIRST_NAME, LAST_NAME, Email, Password, description) VALUES ('Babbis', 'Barbro', 'Holmgren', 'BarHolm@hotmail.com', 'papegoja', 'Lost a lot of motivation after the pandemic but I get so inspired by you guys, and the challenges, that I just keep going. Love Activly!')

INSERT INTO TYPE (Name, points) VALUES('Walk', 0)
INSERT INTO TYPE (Name, points) VALUES('Run', 0)
INSERT INTO TYPE (Name, points) VALUES('Cycling', 0)
--INSERT INTO TYPE (Name, points) VALUES('Yoga', 0)

INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 15, 31)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 27, 17)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 25, 23)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 51, 25)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 57, 14)

INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (1, 19, 25)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 36, 48)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (1, 37, 24)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (2, 22, 24)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 32, 24)

INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 28, 24)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 31, 44)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 25, 05)
INSERT INTO DURATION (HOURS, MINUTES, SECONDS) VALUES (0, 19, 51)


INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-07-21 19:45','Good run! I am so hungry I could eat a horse!',1, 0, 2, 3, 1)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-07-26 08:25','I am exhausted. Happy with my time!',4, 0, 2, 5, 2)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-01 15:56','Had a nice time with my newly repaired bike. I have to get used to the reversed steering!',2, 0, 3, 24, 9)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-02 19:41','Did walk today! Too tired to go for a run!',5, 0, 1, 5, 6)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-04 07:43','Tried to hit all the puddles!',3, 0, 3, 9, 8)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-08 15:45','I just love my bike/run combination! Miss the speeds I achieve on my bike! ',7, 0, 2, 13, 5)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-11 16:48','So glad because of the sunny weather. The forecast foretold showers! Guess I am lycky!' ,3, 0, 1, 3, 3)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-12 18:42','Today it was raining cats and dogs! Used my wonderful yellow raincoat!',5, 0, 2, 4, 7)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-14 19:45','My legs are burning! I love speed! Almost hit an old man (my bad) but he is okey!',2, 0, 3, 15, 6)

INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-19 18:45','I am improving steadily!',1, 0, 1, 5, 10)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-20 16:23','Good form today! If someone is up for a run this weekend, let me know!',3, 0, 2, 6, 11)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-22 09:41','Just got on this new Activly app, really liking it so far! Gonna get all the badges :3',3, 0, 2, 7, 12)

INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-25 11:43','Good walk with my dog! Found a good stick in the forest which he brought home...gosh!',2, 0, 1, 9, 13)
INSERT INTO ACTIVITY (date_Time, notes, user_ID, points, type_ID, distance, duration_ID) VALUES ('2021-08-26 16:33','It does not matter how fast I run, i can never outspeed my dog Ludde!',2, 0, 2, 8, 14)


INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-21 19:45', 'Wow great job!', 2)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-08-16 07:45', 'Kudos! I can not believe you are up that early :D', 2)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-08-16 07:45', 'Nicely Done! I wish i was as fast as you, what is your secret?', 3)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-11 07:45', 'Woop woop! You are doing great!', 1)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-11 07:45', 'Sweet! Are you going to the tracks this weekend?', 1)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-11 07:45', 'Maybe we can train togheter sometime? I think we both would improve.', 3)

INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-20 18:45', 'I was out as well and it sure was lucky! 5 minutes after I came back the sky opened up!', 5)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-20 18:45', 'On the coast we see nothing but blue sky! ', 2)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-20 18:45', 'Oh my, I might just move there one day just based on your weather reports... ', 5)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-20 18:45', 'You know your always welcome :)', 2)

INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-20 18:45', 'It is yellow alright!', 2)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-20 18:45', 'I bet you had one as pretty as mine ;)', 5)

INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-11 07:45', 'Yeah, you have deserved it! I have heard that pineapples are really healthy after a run, restores the electrolytes or something.', 7)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-05-11 07:45', 'Oh really? Maybe i will try it next time!', 1)

INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-08-16 07:45', 'Thanks a lot! You wanna go togheter some time?', 2)
INSERT INTO COMMENT (DATE_TIME, TEXT, USER_ID) VALUES ('2021-08-16 07:45', 'Sure thing!', 3)

INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (1, 1)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (2, 2)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (3, 3)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (4, 5)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (5, 4)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (6, 6)

INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (7, 7)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (7, 8)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (7, 9)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (7, 10)

INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (8, 11)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (8, 12)

INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (1, 13)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (1, 14)

INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (3, 15)
INSERT INTO ACTIVITY_COMMENTS (ACTIVITY_ID, COMMENTS_ID) VALUES (3, 16)

INSERT INTO BADGE (name, description, url, style) VALUES ('WALK', '10', 'firstSteps', 'walk')
INSERT INTO BADGE (name, description, url, style) VALUES ('CYCLING', '50', 'logger', 'cycling')
INSERT INTO BADGE (name, description, url, style) VALUES ('RUN', '15', 'runAMile', 'run')

INSERT INTO BADGE (name, description, url, style) VALUES ('RUN', '30', 'runAMile', 'run')
INSERT INTO BADGE (name, description, url, style) VALUES ('WALK', '20', 'runAMile', 'walk')

INSERT INTO USER_BADGES (USER_ID, BADGES_ID, BADGES_KEY) VALUES (1, 4, 4)
INSERT INTO USER_BADGES (USER_ID, BADGES_ID, BADGES_KEY) VALUES (2, 5, 5)
INSERT INTO USER_BADGES (USER_ID, BADGES_ID, BADGES_KEY) VALUES (3, 4, 4)
INSERT INTO USER_BADGES (USER_ID, BADGES_ID, BADGES_KEY) VALUES (5, 5, 5)

INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (1, 2, 2)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (2, 1, 1)

INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (4, 3, 3)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (3, 4, 4)

INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (3, 2, 2)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (2, 3, 3)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (3, 5, 5)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (5, 3, 3)

INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (1, 7, 7)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (7, 1, 1)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (1, 3, 3)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (3, 1, 1)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (3, 7, 7)
INSERT INTO USER_FRIENDS (USER_ID, FRIENDS_ID, FRIENDS_KEY) VALUES (7, 3, 3)

INSERT INTO CHALLENGE (NAME, DESCRIPTION, START_DATE, END_DATE, TYPE_ID, DISTANCE, BADGE_ID) VALUES ('First Steps', 'Walk the distance in the course of a week to finish this weekly challenge and get rewarded with a stunning badge on your profile', '2021-09-06', '2021-09-16', 1, 10, 1)
INSERT INTO CHALLENGE (NAME, DESCRIPTION, START_DATE, END_DATE, TYPE_ID, DISTANCE, BADGE_ID) VALUES ('Orbiting Pedals','This challenge inspires you to get on your bike and explore your surroundings! Achieve a total of 50 km to get this Badge!' , '2021-09-06', '2021-09-16', 3, 50, 2)
INSERT INTO CHALLENGE (NAME, DESCRIPTION, START_DATE, END_DATE, TYPE_ID, DISTANCE, BADGE_ID) VALUES ('High Mileage', 'Are you a activly running and want a real challenge? If you run a total of 15 kilometers during a week, you can proudly present this badge on your profile!', '2021-09-06', '2021-09-16', 2, 15, 3)