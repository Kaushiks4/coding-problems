package com.oracle.problems.model;

import java.util.Date;

/**
 * The File class represents a file with attributes such as filename, filesize,
 * createdAt, and
 * updatedAt.
 */
public class FileModel {
    private String filename;
    private long filesize;
    private Date createdAt;
    private Date updatedAt;

    public File(String filename, long filesize, Date createdAt, Date updatedAt) {
        this.filename = filename;
        this.filesize = filesize;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and setters for the attributes
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getFilesize() {
        return filesize;
    }

    public void setFilesize(long filesize) {
        this.filesize = filesize;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "File{" +
                "filename='" + filename + '\'' +
                ", filesize=" + filesize +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
