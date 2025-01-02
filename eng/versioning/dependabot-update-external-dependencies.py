import argparse

def main():
    parser = argparse.ArgumentParser(description="Print out the names of dependencies.")
    parser.add_argument('--dependencies', "-d", metavar='D', type=str, nargs='+', help='a list of dependencies')
    parser.add_argument("--variable", type=str)
    parser.add_argument("--json", type=str)
    args = parser.parse_args()


    print(args.variable)
    print(args.json)
    for dependency in args.dependencies:
        print(dependency)

if __name__ == "__main__":
    main()
