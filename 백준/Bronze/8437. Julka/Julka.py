# Read input
total_apples = int(input())  # First line: total number of apples
difference = int(input())    # Second line: how many more apples Klaudia has

# Calculate Klaudia's apples
klaudia = (total_apples + difference) // 2  # Integer division since apples are whole

# Calculate Natalia's apples
natalia = total_apples - klaudia

# Output results
print(klaudia)
print(natalia)