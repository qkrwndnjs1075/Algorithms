# 출력할 데이터
ships = [
    ("N2 Bomber", "Heavy Fighter", "Limited", 21),
    ("J-Type 327", "Light Combat", "Unlimited", 1),
    ("NX Cruiser", "Medium Fighter", "Limited", 18),
    ("N1 Starfighter", "Medium Fighter", "Unlimited", 25),
    ("Royal Cruiser", "Light Combat", "Limited", 4)
]

# 헤더 출력
print(f"{'SHIP NAME':<15}{'CLASS':<15}{'DEPLOYMENT':<11}{'IN SERVICE':<10}")

# 본문 데이터 출력
for name, ship_class, deployment, service in ships:
    print(f"{name:<15}{ship_class:<15}{deployment:<11}{service:<10}")
