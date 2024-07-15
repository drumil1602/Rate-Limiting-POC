# Rate Limiting in Cluster

This project demonstrates rate limiting on a Cluster.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup](#setup)

## Introduction

This project implements rate limiting on a cluster to control the number of requests to certain endpoints.

## Prerequisites

Ensure Docker is installed on your system:
- [Docker](https://www.docker.com/get-started)

## Setup

Follow these steps to set up the project:

1. Clone the repository:
   ```bash
   git clone https://github.com/drumil1602/Rate-Limiting-POC.git
   cd cluster-level
   docker-compose up
## Usage

The project will run on port 8080. It includes three APIs:

1. **/first, /second, and /third** all have **individual** rate limiting applied with a configuration of **3 requests per minute** for each endpoint.

3. You can access the application at:- http://localhost:8080 .
