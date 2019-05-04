package com.example.android.miwok;

public class Word {
    private String englishTrans;
    private String miwokTrans;
    private Integer imgResourceId = -1;
    private Integer audioResourceId;

    public Word(String englishTrans, String miwokTrans, Integer audioResourceId) {
        this.englishTrans = englishTrans;
        this.miwokTrans = miwokTrans;
        this.audioResourceId = audioResourceId;
    }

    public Word(String englishTrans, String miwokTrans, Integer imgResourceId, Integer audioResourceId) {
        this.englishTrans = englishTrans;
        this.miwokTrans = miwokTrans;
        this.imgResourceId = imgResourceId;
        this.audioResourceId = audioResourceId;
    }

    public String getMiwokTrans() {
        return miwokTrans;
    }

    public String getDefaultTrans() {
        return englishTrans;
    }

    public Integer getImageResourceId() {
        return imgResourceId;
    }

    public Integer getAudioResourceId() {
        return audioResourceId;
    }

    public boolean hasImage() {
        return imgResourceId != -1;
    }
}
