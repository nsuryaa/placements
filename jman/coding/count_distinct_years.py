import re

def count_distinct_years(document):
    # Use regular expression to find all occurrences of a four-digit year
    years = re.findall(r'\b\d{4}\b', document)

    # Use set to get distinct years
    distinct_years = set(years)

    # Return the count of distinct years
    return len(distinct_years)

# Example usage:
document = "UN was established on 24-10-1945. India got freedom on 15-08-1947."
result = count_distinct_years(document)
print(result)
