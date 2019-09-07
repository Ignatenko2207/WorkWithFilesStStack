package stack.study;

import stack.study.model.Currency;
import stack.study.service.FileService;

import java.util.Set;

public class ApplicationRunner {

    public static void main(String[] args) {
        Set<Currency> currencies = FileService.getCurrencyFromFile("input.txt");

//        FileService.writeCurrenciesToFile(currencies, "out.txt");

        FileService.copyFile("cat.jpg", "copy_cat.jpg");
    }
}
