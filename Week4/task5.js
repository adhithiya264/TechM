
const student = {
    id: 101,
    name: "Jack Ingoff",
    department: "Computer Science",
    college: "XYZ University",
    email: "jack.ing@gmail.com",
    address: {
        doorNo: "123",
        street: "W Street",
        area: "skibidi",
        pincode: "123456"
    },
    
    displayAllDetails: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Department: ${this.department}`);
        console.log(`College: ${this.college}`);
        console.log(`Email: ${this.email}`);
        console.log(`Address: Door No - ${this.address.doorNo}, Street - ${this.address.street}, Area - ${this.address.area}, Pincode - ${this.address.pincode}`);
    },


    displayIdNameEmail: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Email: ${this.email}`);
    },

    displayDetailsWithAddress: function() {
        console.log(`ID: ${this.id}`);
        console.log(`Name: ${this.name}`);
        console.log(`Email: ${this.email}`);
        console.log(`Address: Door No - ${this.address.doorNo}, Street - ${this.address.street}, Area - ${this.address.area}, Pincode - ${this.address.pincode}`);
    }
};


console.log("Displaying all details:");
student.displayAllDetails();

console.log("\nDisplaying ID, Name, and Email:");
student.displayIdNameEmail();

console.log("\nDisplaying details with address:");
student.displayDetailsWithAddress();

delete student.email;
delete student.displayIdNameEmail;

console.log("\nAfter deleting the email property and displayIdNameEmail function:");
student.displayAllDetails();
