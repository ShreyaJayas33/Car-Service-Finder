// Initialize an empty array to store services
let services = [];

// Function to update the service table display
function updateServiceTable() {
    const tableBody = document.getElementById("serviceTable").getElementsByTagName('tbody')[0];
    tableBody.innerHTML = ''; // Clear the existing table body

    // Populate the table with services
    services.forEach((service, index) => {
        const newRow = tableBody.insertRow();
        newRow.innerHTML = `
            <td>${service.name}</td>
            <td>${service.description}</td>
            <td>$${service.price}</td>
            <td>
                <button onclick="editService(${index})">Edit</button>
                <button onclick="deleteService(${index})">Delete</button>
            </td>
        `;
    });
}

// Function to handle service addition
document.getElementById("serviceForm").onsubmit = function(event) {
    event.preventDefault(); // Prevent form submission
    const serviceName = document.getElementById("serviceName").value;
    const serviceDescription = document.getElementById("serviceDescription").value;
    const servicePrice = document.getElementById("servicePrice").value;

    // Create a new service object and add it to the array
    services.push({
        name: serviceName,
        description: serviceDescription,
        price: servicePrice
    });

    // Update the service table display
    updateServiceTable();

    // Clear the form
    document.getElementById("serviceForm").reset();
};

// Function to edit a service
function editService(index) {
    const service = services[index];
    document.getElementById("serviceName").value = service.name;
    document.getElementById("serviceDescription").value = service.description;
    document.getElementById("servicePrice").value = service.price;

    // Remove the service from the array
    services.splice(index, 1);
    updateServiceTable();
}

// Function to delete a service
function deleteService(index) {
    // Remove the service from the array
    services.splice(index, 1);
    updateServiceTable();
}
