# Rate Limiting in One Server

This project demonstrates rate limiting on a single server.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup](#setup)

## Introduction

This project implements rate limiting on a server to control the number of requests to certain endpoints.

## Prerequisites

Ensure Docker is installed on your system:
- [Docker](https://www.docker.com/get-started)

## Setup

Follow these steps to set up the project:

1. Clone the repository:
   ```bash
   git clone https://github.com/drumil1602/Rate-Limiting-POC.git
   cd your-repo
   docker-compose up
## Usage

The project will run on port 8080. It includes three APIs:

1. **/first** and **/second** have rate limiting applied with a configuration of **2 requests per minute** .

2. **/third** does not have rate limiting applied.

3. You can access the application at:- http://localhost:8080 .
