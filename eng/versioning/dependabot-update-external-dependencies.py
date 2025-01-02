import argparse

def main():
    parser = argparse.ArgumentParser(description="Print out the names of dependencies.")
    parser.add_argument('--dependencies', "-d", metavar='D', type=str, nargs='+', help='a list of dependencies')
    args = parser.parse_args()

    for dependency in args.dependencies:
        print(dependency)

if __name__ == "__main__":
    main()
