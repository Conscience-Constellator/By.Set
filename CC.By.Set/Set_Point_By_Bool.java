package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Bool;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Bool;
import CC.$.Q$Q.Bool$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.Bool_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_Bool<Valu_Typ,From_Typ> extends
	Get_Point_By_Bool<Valu_Typ>,
	Set_Q_By_Bool<From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	Bool_Point$<Valu_Typ>
{
	@Lin_Dclar void Set_Point_By_Bool(boolean By,Valu_Typ Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_Point$(boolean By,Valu_Typ Valu){Set_Point_By_Bool(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point_By_Bool_Sorc(boolean By,Bool$Point<Valu_Typ> Sorc){Set_Point_By_Bool(By,Sorc.Bool$Point(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point1$1_By_Bool(boolean By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_Bool(By,Fun.Point1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point1$1_By_Bool_Sorc(boolean By,Point1$1<Valu_Typ,Valu_Typ> Fun,Bool$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_Bool(By,Fun,Sorc.Bool$Point(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point1$1_By_Bool(boolean By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point2$1_By_Bool(boolean By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Bool(By,Fun.Point2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point2$1_By_Bool_SLit(boolean By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Bool$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Bool(By,Fun,A.Bool$Point(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point2$1_By_Bool(boolean By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Point2$1_By_Bool_Sorc(boolean By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Bool$Point<Valu_Typ> A,Bool$Point<Valu_Typ> B)
				{Set_Point2$1_By_Bool_SLit(By,Fun,A,B.Bool$Point(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Point2$1_By_Bool_Sorc(boolean By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Bool$Point<Valu_Typ> B)
					{Set_Point2$1_By_Bool_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default Valu_Typ SGet_Point_By_Bool(boolean By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Bool(By);
		Set_Point_By_Bool(By,Valu);

		return Stor;
	}
}