package com.photosresourceserver.responseModel;

public class PhotoResponse {
    private String photoTitle;
    private String photoDescription;
    private String photoLocation;
    private String photoUrl;
    private long albumId;

    public PhotoResponse() {
    }

    public PhotoResponse(String photoTitle, String photoDescription, String photoLocation, String photoUrl, long albumId) {
        this.photoTitle = photoTitle;
        this.photoDescription = photoDescription;
        this.photoLocation = photoLocation;
        this.photoUrl = photoUrl;
        this.albumId = albumId;
    }

    public String getPhotoTitle() {
        return photoTitle;
    }

    public void setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle;
    }

    public String getPhotoDescription() {
        return photoDescription;
    }

    public void setPhotoDescription(String photoDescription) {
        this.photoDescription = photoDescription;
    }

    public String getPhotoLocation() {
        return photoLocation;
    }

    public void setPhotoLocation(String photoLocation) {
        this.photoLocation = photoLocation;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }
}
