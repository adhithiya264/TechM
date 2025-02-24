let student = {
    name: "John",
    age: 25,
    grade: "A",
    getDetails: function() {
        return `${this.name}, Age: ${this.age}, Grade: ${this.grade}`;
    },
    address: {
        city: "New York",
        state: "NY"
    },
    updateGrade: function(newGrade) {
        this.grade = newGrade;
    },
    updateAddress: function(newCity, newState) {
        this.address.city = newCity;
        this.address.state = newState;
    }
};

console.log(student.getDetails());
console.log(student.address.city);

student.updateGrade("B");
student.updateAddress("Los Angeles", "CA");

delete student.grade;
console.log(student);
