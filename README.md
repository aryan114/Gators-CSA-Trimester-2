# Gators-CSA-Trimester-2
By Pranav, Aryan, Praveen, Neil
# Welcome to our Project!

### Description

Our project is focused around an E-Commerce store. Users will have to login to the system and play games in order to earn money to spend in the E-Commerce store. These games include a Snake Game and a Sports Simulation. With the money that they earned from playing the games, users can buy and checkout things in the E-Commerce store. 

| Project | Description |
| --- | --- |
| E-Commerce | In the E-Commerce store, users can buy different items and add them to a cart. They can then checkout those items to simulate an actual E-Commerce website, like Amazon. Big Ticket Features will be professional UI and the sending/recieving data from AWS Database to keep a running log of the users expenses. |
| Snake Game | This is going to be one of the games that the users can play to earn money to spend in the E-Commerce store. Scores and earned money will be posted in the Database. This game is going to be similar to Google's Snake Game. Users can either buy powerups or buy items in the E-Commerce store. Big Ticket Items are the use of a DynaboDB to store data about money and points, which the user can see later. |
| Sports Simulation | This will be the second game that users can play to earn money to spend in the E-Commerce store. Users will be able to "bet" on teams and will win money if their team wins or will lose money if their team loses. Big Ticket Features will once again be nice UI and the sending/recieving data from Database. |
| Login-System | Users will need to use the Login System to log into their profile in order to save money/scores from the games to their account. Big Ticket Items will be professional UI and the storing of credentials in AWS Database to retrieve them later; because of this, users will only have to make their account once. |


Link to our Project Plan: [LINK](https://docs.google.com/document/d/13kGw1NK0cC8eVTMHhqx2FforypQqX0jvQrwkl_mz6lw/edit?usp=sharing)

Link to Project Board (Scrum Board): [LINK](https://github.com/aryan114/Gators-CSA-Trimester-2/projects/1)

### Relevant Images for Project
|![](https://github.com/aryan114/Gators-CSA-Trimester-2/blob/02621feaa67d6dacca07f2c818cd7508ea37065c/Images/LoginDB.JPG) |![](https://github.com/aryan114/Gators-CSA-Trimester-2/blob/02621feaa67d6dacca07f2c818cd7508ea37065c/Images/Login%20MVC.JPG) |
| --- | --- |
|![](https://github.com/aryan114/Gators-CSA-Trimester-2/blob/02621feaa67d6dacca07f2c818cd7508ea37065c/Images/sportsdb.JPG) |![](https://github.com/aryan114/Gators-CSA-Trimester-2/blob/02621feaa67d6dacca07f2c818cd7508ea37065c/Images/sportsmvc.JPG) |
|![](https://github.com/aryan114/Gators-CSA-Trimester-2/blob/02621feaa67d6dacca07f2c818cd7508ea37065c/Images/snakedb.JPG) |![](https://github.com/aryan114/Gators-CSA-Trimester-2/blob/02621feaa67d6dacca07f2c818cd7508ea37065c/Images/EDB.JPG) |



### Self-Scoring For Week of 1/11

#### Goals Accomplished as a Team:
* All of us are connected to AWS. Everyone is able to update/create/delete tables on DynamoDB.
* Integrated project by adding everything to a main menu to make user navigation easier.
* Updated Scrum Board with Issues and Labels - better organization and keeping track of tasks to do.

Self-Score: 20/20 for being able to accomplish all the goals that were discussed at the beginning of the week.

[LINK](https://github.com/aryan114/Gators-CSA-Trimester-2/projects/1) to Scrum Board. There is a label on each card/issue indicating the person responsible for finishing that piece of code. If you click on the card, there are links to code and how to evaluate the card during runtime in the comments section for the cards in the "Done-Ready to Pull" section.

#### Running the Login System - Pranav 
Before running the login system, please use the credentials that I DM'd you on Slack to configure your IAM account so that the login system can connect to the DynamoDB database. This includes editing the config file and installing the AWS SDK. You can use this [LINK](https://docs.google.com/document/d/1_nTjbLF-sSyJ_rsqBOitQruEy1XE9M9vKYNZdZMdOWY/edit) to do that (steps 9 to 14).

I sent you your IAM credentials via Slack.
Once you are connected, you should be able to add new users, delete them, and login with them. This activity will update in the DynamoDB table that is accessed by logging into the [AWS website](https://signin.aws.amazon.com/) as an IAM User. Just as a general note, the DynamoDB table in which the credentials are stored is named "Credentials".

To run the login system, run the Login.java file.

I also made a video to demo the Login System: https://www.loom.com/share/9e1f133dd24d49628e0ebea33b7ce6fe



#### Running the Sports Simulation - Aryan
While running the sports simulation, please run the SportsMenu.java file. This will pull up a screen displaying the three different simulations (football NFL, basketball NBA, baseball MLB). Please put the team name, not city, and the name should be in lowercase letters. Choose the team that you think will win between two teams, and press the button and see who wins! You will also get currency.

#### My contributions in the Scrum Board: https://github.com/aryan114/Gators-CSA-Trimester-2/projects/1?card_filter_query=label%3Aaryan

Video to demo the Sports Simulation: https://drive.google.com/file/d/1rx8_PSTii72JE5Ov1m0bqGPwinffwv3W/view?usp=sharing

#### Running the Eccomerce website
To run the eccomerce website, please run the Itemspage.java file. This will display a screen where you are able to type in any item that you want to buy. If the item is not in stock, then the button will say so. An attempt was made to make the eccomerce site work with AWS, but I wasn't able to quite finish it. Therfore, it is all commented out, but it should be done by next week.

Contributions to Scum Board
https://github.com/aryan114/Gators-CSA-Trimester-2/projects/1?card_filter_query=label%3Apraveen 

#### Running the Snake Game - Neil
To run the snake game, please run the SnakeGame.java file. This will display a screen where you have to fullscreen and then you will be loaded into a snake game automatically. Use the arrows keys to move around to collect the blue dots to see your score grow. This week, the snake game became connected to AWS but in order to not interfere with the table, it is all commented out, next week it should be fully done and all ready to send your high scores!.

Contributions to Scum Board
https://github.com/aryan114/Gators-CSA-Trimester-2/projects/1?card_filter_query=label%3Aneil 
