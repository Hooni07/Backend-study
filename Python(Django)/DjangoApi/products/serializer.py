# python 객체 -> json 형태로 반환
from rest_framework import serializers
from products.models import Product

class ProductSerializer(serializers.ModelSerializer):
  
  class Meta:
    model = Product
    fields = (
      "id",
      'product_name',
      'price'
    )