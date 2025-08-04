import React from "react";

function CourseDetails() {
  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/3/20201" },
  ];

  return (
    <div className="column">
      <h2>Course Details</h2>
      {courses.map((course) => (
        <div key={course.id} style={{ marginBottom: "15px" }}>
          <strong>{course.name}</strong>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
