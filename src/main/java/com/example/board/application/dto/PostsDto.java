package com.example.board.application.dto;


import com.example.board.domain.Posts;
import com.example.board.domain.User;
import lombok.*;

public class PostsDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Request{
        private Long id;

        private String title;

        private String writer;

        private String content;

        private String createdDate, modifiedDate;

        private int view;

        private User user;

        // Dto -> Entity
        public Posts toEntity(){
            Posts posts = Posts.builder()
                    .id(id)
                    .title(title)
                    .writer(writer)
                    .content(content)
                    .view(0)
                    .user(user)
                    .build();

            return posts;
        }

        @Getter
        public static class Response{
            private final Long id;

            private final String title;

            private final String writer;

            private final String content;

            private final String createdDate, modifiedDate;

            private final int view;

            private final Long userId;

            // Entity -> Dto
            public Response(Posts posts){
                this.id = posts.getId();
                this.title = posts.getTitle();
                this.writer = posts.getWriter();
                this.content = posts.getContent();
                this.createdDate = posts.getCreatedDate();
                this.modifiedDate = posts.getModifiedDate();
                this.view = posts.getView();
                this.userId = posts.getUser().getId();

            }

        }
    }

}
