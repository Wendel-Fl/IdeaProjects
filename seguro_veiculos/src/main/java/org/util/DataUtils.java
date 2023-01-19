package org.util;

import org.excecoes.DataInvalidaException;
import org.excecoes.IdadeInvalidaException;
import org.joda.time.DateTime;
import org.joda.time.Months;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

    public static String DateToString(Date date){
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    public static Date StringToDate(String dateString) {

        Date data = null;
        if(validaData(dateString)){
            try {
                data = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            }catch (ParseException pe){
                pe.getMessage();
            }
        }

        return data;
    }

    public static Integer calculaDiferencaEntreDatas(DateTime start, DateTime end){

        return Months.monthsBetween(start, end).getMonths()/12;

    }

    public static boolean validaIdade(Date d1, Date d2){
        boolean result = false;
        Calendar data1 = Calendar.getInstance();
        data1.setTime(d1);
        int dia1 = data1.get(Calendar.DAY_OF_MONTH);
        int mes1 = data1.get(Calendar.MONTH);
        int ano1 = data1.get(Calendar.YEAR);

        Calendar data2 = Calendar.getInstance();
        data2.setTime(d2);
        int dia2 = data2.get(Calendar.DAY_OF_MONTH);
        int mes2 = data2.get(Calendar.MONTH);
        int ano2 = data2.get(Calendar.YEAR);

        int mes []= {31,0,31,30,31,30,31,31,30,31,30,31};
        int dias = 0, meses = 0, anos = 0;
        String temp = Integer.toString(ano1);

        if(temp.charAt(temp.length() - 1) == '0' && temp.charAt(temp.length() - 2) == '0') {
            if(ano1 % 400 == 0) {
                mes[1] = 29;
            }else {
                mes[1] = 28;
            }
        }else if(ano1 % 4 == 0) {
            mes[1] = 29;
        }else {
            mes[1] = 28;
        }

        anos = ano2 - ano1;

        if(mes2 > mes1 || mes1 == mes2) {
            meses = mes2 - mes1;
        }else {
            meses = 12 - (mes1 - mes2);
            anos -= 1;
        }

        if(dia2 > dia1 || dia1 == dia2) {
            dias = dia2 - dia1;
        }else {
            dias = (mes[mes1 - 1] - dia1) + dia2;
            meses -= 1;
        }

        Integer diferenca[] = new Integer[3];
        diferenca[0] = dias;
        diferenca[1] = meses;
        diferenca[2] = anos;

        //System.out.printf("* Diferença em dias/meses/anos:\n\n-> %d dia(s) / %d mes(es) / %d ano(s) .\n\n",dias,meses,anos);
        if (anos >= 18 && anos <=75)
            result = true;
        else
            throw new IdadeInvalidaException("Idade Inválida!");
        return result;
    }

    public static int getIdade(Date d1, Date d2){
        Calendar data1 = Calendar.getInstance();
        data1.setTime(d1);
        int ano1 = data1.get(Calendar.YEAR);

        Calendar data2 = Calendar.getInstance();
        data2.setTime(d2);
        int ano2 = data2.get(Calendar.YEAR);

        int idade = ano2 - ano1;

        return idade;
    }

    public static boolean validaData(String dateString) {
        boolean result;
        String[] dados = dateString.split("/");
        int dia = Integer.parseInt(dados[0]);
        int mes = Integer.parseInt(dados[1]);
        int ano = Integer.parseInt(dados[2]);

        if (dia > 31 || mes > 12 || (ano < 1900 || ano > 2023)){
            throw new DataInvalidaException("Data Inválida!");
        }

        int[] mesesTrintaDias = {4,6,9,11};
        for(int i = 0; i < mesesTrintaDias.length; i++){
            if(mes == mesesTrintaDias[i] && dia > 30){
                throw new DataInvalidaException("Data Inválida!");
            }
        }

        if((mes == 2) && (dia > 29)){
            throw new DataInvalidaException("Data Inválida!");
        }
        result = true;
        return result;
    }
}
