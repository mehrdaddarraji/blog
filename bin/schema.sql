/*
Id:           The unique id to identify the post.
Category Id:  The category id to be identify similar posts.
Title:        The post title to be displayed on the Post Page and the lists.
Meta Title:   The meta title to be used for browser title and SEO.
Slug:         The post slug to form the URL.
Post Image:   The image to be placed under the title.
Summary:      The summary of the post to mention the key highlights.
Published:    It can be used to identify whether the post is publicly available.
Created At:   It stores the date and time at which the post is created.
Updated At:   It stores the date and time at which the post is updated.
Published At: It stores the date and time at which the post is published.
Content:      The column used to store the post data.
*/

CREATE TABLE POST (
    ID BIGSERIAL PRIMARY KEY,
    CATEGORY BIGINT NULL DEFAULT NULL,
    TITLE VARCHAR(75) NOT NULL,
    META_TITLE VARCHAR(100) NULL,
    SLUG VARCHAR(100) UNIQUE NOT NULL,
    POST_IMAGE BYTEA NULL,
    SUMMARY TEXT NULL,
    PUBLISHED BOOLEAN NOT NULL DEFAULT FALSE,
    CREATED_AT TIMESTAMP NOT NULL,
    UPDATED_AT TIMESTAMP NULL DEFAULT NULL,
    PUBLISHED_AT TIMESTAMP NULL DEFAULT NULL,
    CONTENT TEXT NULL DEFAULT NULL
);