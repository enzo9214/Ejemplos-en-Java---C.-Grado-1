from django.db import models
import datetime
from django.utils import timezone

# Create your models here.
# Modificado por Enzo, usar siempre CamelCase

class Usuario(models.model):#Post nombre del modelo puesto por mi(Table Name)
    nombre = models.CharField(max_length=100)#VARCHAR(100) #id automatico
    creditos = models.IntegerField()
    created_date = models.DateTimeField(default=timezone.now)
    modified_date = models.DateTimeField(blank=True, null=True)

    def publish(self):
        self.modified_date = timezone.now()
        self.save()