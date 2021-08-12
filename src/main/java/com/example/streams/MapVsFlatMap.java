package com.example.streams;

import com.example.database.Database;
import com.example.database.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * map() -> it processes stream of values           flatMap() -> It processes stream of stream of values
 * map() -> it does only mapping                    flatMap() -> It does mapping + flattening
 * map() -> One to One Mapping                      flatMap() -> One to Many Mapping
 *
 */
public class MapVsFlatMap {

    public static void main(String[] args) {
        List<User> listOfUsers = Database.getUsers();
        System.out.println("*************** Using Map : Get List of emails from the List of users ************");
        // map() -> One to One Mapping : meaning one user object can only have one email address
        // map() -> is for Data Transformation only
        List<String> listOfEmails = listOfUsers.stream().map(user -> user.getEmail()).collect(Collectors.toList());
        System.out.println("List of Emails => " +  listOfEmails);
        System.out.println("*************** Using Map : Method Reference : Get List of emails from the List of users ************");
        // map() -> One to One Mapping : meaning one user object can only have one email address
        // map() -> is for Data Transformation only
        List<String> listOfEmails1 = listOfUsers.stream().map(User::getEmail).collect(Collectors.toList());
        System.out.println("Method Reference : List of Emails => " +  listOfEmails1);

        System.out.println("*************** map() vs flatMap() ************");
        System.out.println("*********** Using Map gives List of List<String> ************************");
        List<List<String>> listOfPhones = listOfUsers.stream().map(user -> user.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(" listOfPhones => " +  listOfPhones);
        System.out.println("*********** Using flatMap gives List<String> ************************");
        // flatMap() -> One to Many Mapping : meaning one user object can only have many Phone numbers
        // flatMap() -> is for Data Transformation + Flattening the data
        List<String> listOfPhonenumbers = listOfUsers.stream().flatMap(user -> user.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(" listOfPhonenumbers => " +  listOfPhonenumbers);

    }
}
