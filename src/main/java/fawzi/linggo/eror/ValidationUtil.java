package fawzi.linggo.eror;

import fawzi.linggo.record.Record;

public class ValidationUtil {
    public static void validate(Record record) throws ValidationExaption, NullPointerException{
        if (record.username() == null){
            throw new NullPointerException("Username Gak boleh Null sayang");
        } else if (record.username().isBlank()) {
            throw new ValidationExaption("Username gak boleh kosong");
        } else if (record.password() == null) {
            throw new NullPointerException("Password Tidak Boleh Null");
        } else if (record.password().isBlank()) {
            throw new ValidationExaption("password tidak boleh null");
        }
    }
}
