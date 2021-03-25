package com.org.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import com.google.gson.Gson;

public class Demo6nomads {

    public static void main(String[] args) {
        List<String> usernames = getUsernames(1);
        usernames.forEach(System.out::println);
    }

    public static List<String> getUsernames(int threshold) {
        List<String> collect = new LinkedList<>();
        Data data = null;
        try {
            data = new Gson().fromJson(Objects.requireNonNull(getUri(1)).readLine(), Data.class);
            User[] users = data.getData();
            collect = Arrays.stream(users).filter(user -> Integer.parseInt(user.getSubmission_count()) > threshold)
                    .map(User::getUsername).collect(Collectors.toList());


            int totalPages = Integer.parseInt(data.getTotal_pages());

            for(int i=2;i<=totalPages;i++) {
                data = new Gson().fromJson(Objects.requireNonNull(getUri(i)), Data.class);
                User[] us = data.getData();
                List<String> c = Arrays.stream(us).filter(user -> Integer.parseInt(user.getSubmission_count())  > threshold)
                        .map(User::getUsername).collect(Collectors.toList());

                collect.addAll(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
         return collect;
    }

    public static BufferedReader getUri(int pageNo) {
        URL url = null;
        BufferedReader in = null;

        try {
            url = new URL("https://jsonmock.hackerrank.com/api/article_users?page="+pageNo);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("accept", "application/json");
             in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));

            return in;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    class Data {
        private String page;
        private String per_page;
        private String total;
        private String total_pages;
        private User[] data;

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getPer_page() {
            return per_page;
        }

        public void setPer_page(String per_page) {
            this.per_page = per_page;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(String total_pages) {
            this.total_pages = total_pages;
        }

        public User[] getData() {
            return data;
        }

        public void setData(User[] data) {
            this.data = data;
        }
    }

    class User {
        private String id;
        private String username;
        private String about;
        private String submitted;
        private String updated_at;
        private String submission_count;
        private String comment_count;
        private String created_at;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public String getSubmitted() {
            return submitted;
        }

        public void setSubmitted(String submitted) {
            this.submitted = submitted;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getSubmission_count() {
            return submission_count;
        }

        public void setSubmission_count(String submission_count) {
            this.submission_count = submission_count;
        }

        public String getComment_count() {
            return comment_count;
        }

        public void setComment_count(String comment_count) {
            this.comment_count = comment_count;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }
    }
}
