
# BPI ATM Dispenser System (Chain of Responsibility)

An automated ATM cash dispensing simulation designed for the **Bank of the Philippine Islands (BPI)**. This project implements the **Chain of Responsibility** design pattern to process withdrawal requests by breaking them down into specific PHP denominations.

## Overview

The core objective is to handle cash withdrawals efficiently by passing the request through a series of "handlers." Each handler represents a specific bill denomination and dispenses the maximum number of bills possible before passing the remaining amount to the next handler in the chain.

### Features

* **Hierarchical Dispensing**: Automatically calculates the optimal number of bills.
* **Extensible Design**: Easily add or remove bill denominations without modifying existing client code.
* **Validation**: Ensures the requested amount is a multiple of the lowest available denomination.

---

## Supported Denominations

Originally designed for 1000, 500, and 100 PHP bills, the system has been updated to support a wider range of currency for better transaction flexibility.

| High Denominations | New Additions (Current Version) |
| --- | --- |
| ₱1,000 | **₱200** |
| ₱500 | **₱50** |
| ₱100 | **₱20** |

