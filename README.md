# Rate Limiting POC

## Overview

This repository contains a proof of concept (POC) for implementing rate limiting in a Java Spring Boot application. Rate limiting is a technique used to control the amount of incoming or outgoing traffic to or from a network or application. It helps prevent abuse and ensure fair usage of resources by enforcing limits on the number of requests a user can make within a certain time frame.

## What is Rate Limiting?

Rate limiting is a strategy for limiting the number of requests a user can make to a server within a specific period. This is essential for:

- **Preventing Abuse**: Protecting the application from being overwhelmed by excessive requests.
- **Ensuring Fair Usage**: Ensuring that all users have equal access to resources.
- **Enhancing Security**: Thwarting potential DDoS attacks by limiting the rate at which a single user can send requests.
- **Improving Performance**: Ensuring the stability and performance of the application by managing the load.

## Implementation Details

In this POC, rate limiting has been implemented in two different ways:

1. **In-Memory Rate Limiting**: This approach uses an in-memory data structure to track request counts and enforce limits.
2. **Redis-based Rate Limiting**: This approach uses Redis, a distributed in-memory data store, to maintain request counts and enforce limits.

Both methods demonstrate how to apply rate limiting at the code level within a Spring Boot application.
