package com.company;

public class clsSocialMedia {

    String message;
    String photo;
    String tags;

    public clsSocialMedia(String message, String photo, String tags) {
        this.message = message;
        this.photo = photo;
        this.tags = tags;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void socialMedia() {
        /* INSTRUCTIONS */
        System.out.println(" **Post to Social Media App** ");

        if (message.equals("")) {
            System.out.println("Please enter a message");
        } else {
            System.out.println("Message: " + message);
        }

        if (!photo.equals("")) {
            System.out.println("Photo: " + photo);
        }

        if (!tags.equals("")) {
            System.out.println("Tags: " + tags);
        }

        System.out.println("Posting to Social Media");

    }

}
