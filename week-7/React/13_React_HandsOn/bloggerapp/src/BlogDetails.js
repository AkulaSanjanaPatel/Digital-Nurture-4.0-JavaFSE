import React from "react";

function BlogDetails() {
  const blogs = [
    { id: 1, title: "React Learning", author: "Stephen Biz", description: "Welcome to learning React!" },
    { id: 2, title: "Installation", author: "Schwezdenier", description: "You can install React from npm." },
  ];

  return (
    <div className="column">
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id} style={{ marginBottom: "15px" }}>
          <strong>{blog.title}</strong>
          <p style={{ fontWeight: "bold" }}>{blog.author}</p>
          <p>{blog.description}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
