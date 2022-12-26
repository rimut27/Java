package oop.apk;

import oop.data.company;

public class companyapps {
    public static void main(String[] args) {

        company company1 = new company();
        company1.setNama("Alibaba wakwaw");

        company.employe karyawan1 = company1.new employe();
        karyawan1.setNama("baba");

        System.out.println(karyawan1.getNama());
        System.out.println(karyawan1.getco());

    }
}
