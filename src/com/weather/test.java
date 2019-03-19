package com.weather;

public class test {



        public static void main(String[] args) {

            WeatherUtil weath = new WeatherUtil();





            String weather = weath.getWeather("青岛");

            String len[] = weather.split("#");

            for(int i = 0; i < len.length; i++) {

                System.out.println(len[i]);

            }

        }



}
