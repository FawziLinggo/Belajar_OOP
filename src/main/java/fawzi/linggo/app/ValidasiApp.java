package fawzi.linggo.app;

import fawzi.linggo.eror.ValidationExaption;
import fawzi.linggo.eror.ValidationUtil;
import fawzi.linggo.record.Record;

public class ValidasiApp {
    public static void main(String[] args) {
        Record record = new Record(null,null);
        try {
            ValidationUtil.validate(record);
            System.out.println("data Valid");
        } catch (ValidationExaption exaption){
            System.out.println("Data Tidak Valid " + exaption.getMessage());
        } catch (NullPointerException exaption){
            System.out.println("Data Null " + exaption.getMessage());
        }

    }
}
