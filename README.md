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

Goals Accomplished as a Team:
* All of us are connected to AWS. Everyone is able to update/create/delete tables on DynamoDB.
* Integrated project by adding everything to a main menu to make user navigation easier.
* Updated Scrum Board with Issues and Labels - better organization and keeping track of tasks to do.

Self-Score: 20/20 for being able to accomplish all the goals that were discussed at the beginning of the week.

#### Running the Login System
Before running the login system, please use the credentials that I DM'd you on Slack to configure your IAM account so that the login system can connect to the DynamoDB database. This includes editing the config file and installing the AWS SDK. You can use this [LINK](https://docs.google.com/document/d/1_nTjbLF-sSyJ_rsqBOitQruEy1XE9M9vKYNZdZMdOWY/edit) to do that (stepts 9 to 14).

I sent you your IAM credentials via Slack.
Once you are connected, you should be able to add new users, delete them, and login with them. This activity will update in the DynamoDB table that is accessed by logging into the [AWS website](https://signin.aws.amazon.com/) as an IAM User.

