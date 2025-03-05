def merge_dictionaries(dict1, dict2):
    merged = dict1.copy()
    for key, value in dict2.items():
        if key in merged:
            merged[key] = merged[key] + value
        else:
            
            merged.key = value  
    return merged

print(merge_dictionaries({'a': 10, 'b': 20}, {'b': 30, 'c': 40}))
