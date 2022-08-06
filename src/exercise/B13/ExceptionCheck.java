package exercise.B13;

import exercise.B13.Exception.BirthDayException;
import exercise.B13.Exception.EmailException;
import exercise.B13.Exception.FullNameException;
import exercise.B13.Exception.PhoneException;

import java.time.LocalDate;

public class ExceptionCheck {
    public boolean dayCheck(LocalDate birthday) {
        int d = birthday.getDayOfMonth();
        int m = birthday.getMonthValue();
        int y = birthday.getYear();
        if (m > 12 | m < 1) {
            return false;
        }
        if (d < 1 | d > 31) {
            return false;
        }
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                return (d <= 29);
            }
            else return (d <= 28);
        }
        if (m == 4 || m == 6 ||
                m == 9 || m == 11)
            return (d <= 30);
        return true;
    }

    public void birthdayCheck(LocalDate birthday) throws BirthDayException {
        if (dayCheck(birthday)) {

        } else {
            throw new BirthDayException(
                    "Invalid day!"
            );
        }
    }

    public boolean phoneNumberCheck(String number) {
        if (number.charAt(0) != '0') {
            return false;
        }
        int n = number.charAt(1) - 48;
        System.out.println(n);
        if (n != 3 && n != 5 && n != 7 && n != 9) {
            return false;
        }
        return true;
    }

    public void phoneCheck(String number) throws PhoneException {
        if (phoneNumberCheck(number)) {

        } else {
            throw new PhoneException(
                    "Invalid phone number"
            );
        }
    }

    public boolean emailCheckValid(String email) {
        String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        if (email.matches(regex)) {
            return true;
        }
        return false;
    }

    public void emailCheck(String email) throws EmailException {
        if (emailCheckValid(email)) {

        } else {
            throw new EmailException(
                    "Invalid email"
            );
        }
    }

    public boolean nameCheckValid(String name) {
        String regex = "^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)";
        if (name.matches(regex)) {
            return true;
        }
        else return false;
    }

    public void nameCheck(String name) throws FullNameException {
        if (nameCheckValid(name)) {

        } else {
            throw new FullNameException(
                    "Invalid name"
            );
        }
    }
}
