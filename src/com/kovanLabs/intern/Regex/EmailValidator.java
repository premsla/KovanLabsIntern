package com.kovanLabs.intern.Regex;

public class EmailValidator {
    public static void main(String[] args) {
        String regex = "^(?!\\.)(?!.*\\.\\.)[a-zA-Z0-9._%+-]+(?<!\\.)@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        String[] emails = {"user@gmail.com", "test.user@yahoo.com", "admin123@company.org", "hello_world@mail.in", "abc.def@domain.co", "name99@college.edu", "info@service.net", "user-name@host.com", "email123@test.io", "simple@mail.com",

                "usergmail.com", "user@.com", "user@domain", "@gmail.com", "user@domain.", "user@domain,com", "user name@gmail.com", "user@domain@com", "user@domain.c", "user@domain#com"};
        for (String email : emails) {
            System.out.println(email + " ->" + email.matches(regex));
        }

    }
}