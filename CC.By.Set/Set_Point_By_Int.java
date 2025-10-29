package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Int;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.$.Q$Q.Int$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.Int_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_Int<Valu_Typ,From_Typ> extends
	Get_Point_By_Int<Valu_Typ>,
	Set_Q_By_Int<From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	Int_Point$<Valu_Typ>
{
	@Lin_Dclar void Set_Point_By_Int(int By,Valu_Typ Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Int_Point$(int By,Valu_Typ Valu){Set_Point_By_Int(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point_By_Int_Sorc(int By,Int$Point<Valu_Typ> Sorc){Set_Point_By_Int(By,Sorc.Int$Point(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point1$1_By_Int(int By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_Int(By,Fun.Point1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point1$1_By_Int_Sorc(int By,Point1$1<Valu_Typ,Valu_Typ> Fun,Int$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_Int(By,Fun,Sorc.Int$Point(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point1$1_By_Int(int By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point2$1_By_Int(int By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Int(By,Fun.Point2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point2$1_By_Int_SLit(int By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Int$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Int(By,Fun,A.Int$Point(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point2$1_By_Int(int By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Int_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Point2$1_By_Int_Sorc(int By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Int$Point<Valu_Typ> A,Int$Point<Valu_Typ> B)
				{Set_Point2$1_By_Int_SLit(By,Fun,A,B.Int$Point(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Point2$1_By_Int_Sorc(int By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Int$Point<Valu_Typ> B)
					{Set_Point2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int$Point<Valu_Typ> Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_Point_By_Int(IndX,Sorc.Int$Point(IndX));}
		}
		
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default Valu_Typ SGet_Point_By_Int(int By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Int(By);
		Set_Point_By_Int(By,Valu);

		return Stor;
	}
}