# Base image with Node.js
FROM node:18

# Metadata about the image
LABEL authors="irena"

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json for dependency installation
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application
COPY . .

# Expose the port your app uses
EXPOSE 3000

# Command to run the React development server
CMD ["npm", "start"]
