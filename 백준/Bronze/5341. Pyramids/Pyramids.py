def main():
    import sys
    for line in sys.stdin:
        n = int(line.strip())
        if n == 0:
            break
        total_blocks = n * (n + 1) // 2
        print(total_blocks)

if __name__ == "__main__":
    main()