package com.example.androidfundamentalsspring2023.retrofit;

import com.google.gson.annotations.SerializedName;

public class Issue {
    private String title;
    private String body;
    @SerializedName("node_id")
    private String nodeId;
    private String url;
    @SerializedName("repository_url")
    private String repositoryUrl;
    private String state;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", nodeId='" + nodeId + '\'' +
                ", url='" + url + '\'' +
                ", repositoryUrl='" + repositoryUrl + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}