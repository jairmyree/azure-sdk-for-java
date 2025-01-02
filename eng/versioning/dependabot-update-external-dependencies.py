import argparse
import json

def main():
    parser = argparse.ArgumentParser(description="Print out the names of dependencies.")
    parser.add_argument("--json", type=str)
    parser.add_argument("--object")
    args = parser.parse_args()

    json_string_obj = json.loads(args.object)
    print(json_string_obj)
    print(args.json)
    for dependency in args.dependencies:
        print(dependency)

if __name__ == "__main__":
    main()
